package com.skan.farm.model;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 판매지정보 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@Entity
@Getter@Setter
@ToString(exclude = "localBeefManagement")
//@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
@JsonIgnoreProperties(ignoreUnknown = true,value = {"hibernateLazyInitializer","$$_hibernate_interceptor", "handler"})
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class CattleSellStoreInformation implements Serializable {

	/**
	 * 생성자.
	 */
	public CattleSellStoreInformation() {
	}


	@Builder
	public CattleSellStoreInformation(LocalBeefManagementPK localBeefManagementPK, String storeName, LocalDate sellDate, String sellNote, String sellPhoneNumber, Integer sellingPrice, Short liveweight, Short dressedWeight, String beefGrade) {
		this.localBeefManagementPK = localBeefManagementPK;
		this.storeName = storeName;
		this.sellDate = sellDate;
		this.sellNote = sellNote;
		this.sellPhoneNumber = sellPhoneNumber;
		this.sellingPrice = sellingPrice;
		this.liveweight = liveweight;
		this.dressedWeight = dressedWeight;
		this.beefGrade = beefGrade;
	}

	@EmbeddedId
	protected LocalBeefManagementPK localBeefManagementPK;

	/** 판매처. */
	private String storeName;

	/** 판매/도태일자. */
	private LocalDate sellDate;

	/** 비고. */
	private String sellNote;

	/** 판매 연락처. */
	private String sellPhoneNumber;

	/** 판매가격. */
	private Integer sellingPrice;

	/** 생체중(살아있는생물의무게). */
	private Short liveweight;

	/** 도체중( 도살한 가축의 가죽, 머리, 발목, 내장 따위를 떼어 낸 나머지 몸뚱이의 체중.). */
	private Short dressedWeight;

	/** 등급(1++A, 1++B). */
	private String beefGrade;

	@MapsId("localBeefManagementPK")
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "entityIdentificationNumber", referencedColumnName = "entityIdentificationNumber"),
			@JoinColumn(name = "entityManagementNumber", referencedColumnName = "entityManagementNumber"),
	})
	@JsonBackReference
	/** 한우(암소/수소) 개체관리기록부. */
	private LocalBeefManagement localBeefManagement;

}
