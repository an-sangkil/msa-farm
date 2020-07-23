package com.skan.farm.service;

import com.skan.farm.model.CalvesManagement;
import com.skan.farm.model.LocalBeefManagement;
import com.skan.farm.paging.PageImpl;
import com.skan.farm.paging.Page;
import com.skan.farm.repository.jooq.LocalBeefManagementJooqRepository;
import com.skan.farm.repository.jpa.LocalBeefManagementJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2020 by CJENM|Mezzomedia. All right reserved.
 * @since 2020-07-09
 */
@Service
@RequiredArgsConstructor
public class CattleManagementService {

    private final LocalBeefManagementJpaRepository localBeefManagementJpaRepository;
    private final LocalBeefManagementJooqRepository localBeefManagementJooqRepository;

    public org.springframework.data.domain.Page findAllPaging(Pageable pageable) {
        return localBeefManagementJpaRepository.findAll(pageable);
    }
    public PageImpl<LocalBeefManagement> findAll(LocalBeefManagement localBeefManagement, com.skan.farm.paging.Pageable pageable) {
        PageImpl<LocalBeefManagement> pageImpl = localBeefManagementJooqRepository.findAll(localBeefManagement, pageable);
        pageImpl.getContents().forEach(localBeefManagement1 -> {
            localBeefManagement1.setCalvesManagementSet(Set.of(new CalvesManagement()));
        });

        return pageImpl;
    }

}
