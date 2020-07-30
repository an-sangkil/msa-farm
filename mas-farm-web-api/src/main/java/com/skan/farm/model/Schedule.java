package com.skan.farm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * 일정관리 테이블 모델 클래스.
 *
 * @author generated by ERMaster
 * @version $Id$
 */
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Schedule implements Serializable {

    @Builder
    public Schedule(String uuid, Short seq, LocalDate standardDate, String subject, String content, String todayWeatherCode, Short minimumTemperature, Short maximumTemperature, String publicYn) {
        this.uuid = uuid;
        this.seq = seq;
        this.standardDate = standardDate;
        this.subject = subject;
        this.content = content;
        this.todayWeatherCode = todayWeatherCode;
        this.minimumTemperature = minimumTemperature;
        this.maximumTemperature = maximumTemperature;
        this.publicYn = publicYn;
    }

    /**
     * uuid.
     */
    @Id
    @Column(length = 128)
    private String uuid;

    /**
     * 같은날의 순번.
     */
    private Short seq;

    /**
     * 기준날짜.
     */
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate standardDate;


    /**
     * 제목.
     */
    private String subject;

    /**
     * 내용.
     */
    private String content;


    /**
     * 오늘 날씨.
     */
    private String todayWeatherCode;


    /**
     * 최저 기온.
     */
    private Short minimumTemperature;

    /**
     * 최고온도.
     */
    private Short maximumTemperature;

    /**
     * 생성시간.
     */
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @CreationTimestamp
    private LocalDateTime createdTime;

    /**
     * 수정시간.
     */
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @UpdateTimestamp
    private LocalDateTime modifiedTime;

    /**
     * 공개 여부.
     */
    private String publicYn;

    /**
     * 그룹관리.
     */
    @Transient
    private GroupManagement groupManagement;

    /**
     * 그룹멤버.
     */
    @Transient
    private GroupMember groupMember;


}
