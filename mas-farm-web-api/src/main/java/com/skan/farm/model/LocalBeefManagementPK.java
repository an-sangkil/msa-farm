package com.skan.farm.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2020 by CJENM|Mezzomedia. All right reserved.
 * @since 2020-07-07
 */
@Embeddable
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class LocalBeefManagementPK implements Serializable {
    /**
     * 개체관리번호.
     */
    private String entityManagementNumber;

    /**
     * 개체식별번호.
     */
    private String entityIdentificationNumber;

    public LocalBeefManagementPK() {
    }
}