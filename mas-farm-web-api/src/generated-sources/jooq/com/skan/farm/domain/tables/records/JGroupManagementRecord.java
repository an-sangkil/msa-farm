/*
 * This file is generated by jOOQ.
 */
package com.skan.farm.domain.tables.records;


import com.skan.farm.domain.tables.JGroupManagement;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JGroupManagementRecord extends UpdatableRecordImpl<JGroupManagementRecord> implements Record4<Integer, String, String, LocalDateTime> {

    private static final long serialVersionUID = 73186680;

    /**
     * Setter for <code>naive-it-farm.group_management.group_no</code>. 그룹번호
     */
    public void setGroupNo(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>naive-it-farm.group_management.group_no</code>. 그룹번호
     */
    public Integer getGroupNo() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>naive-it-farm.group_management.group_name</code>. 그룹 이름
     */
    public void setGroupName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>naive-it-farm.group_management.group_name</code>. 그룹 이름
     */
    public String getGroupName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>naive-it-farm.group_management.group_desc</code>. 그룹설명
     */
    public void setGroupDesc(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>naive-it-farm.group_management.group_desc</code>. 그룹설명
     */
    public String getGroupDesc() {
        return (String) get(2);
    }

    /**
     * Setter for <code>naive-it-farm.group_management.group_crt_time</code>. 그룹 생성일
     */
    public void setGroupCrtTime(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>naive-it-farm.group_management.group_crt_time</code>. 그룹 생성일
     */
    public LocalDateTime getGroupCrtTime() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, String, LocalDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return JGroupManagement.GROUP_MANAGEMENT.GROUP_NO;
    }

    @Override
    public Field<String> field2() {
        return JGroupManagement.GROUP_MANAGEMENT.GROUP_NAME;
    }

    @Override
    public Field<String> field3() {
        return JGroupManagement.GROUP_MANAGEMENT.GROUP_DESC;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return JGroupManagement.GROUP_MANAGEMENT.GROUP_CRT_TIME;
    }

    @Override
    public Integer component1() {
        return getGroupNo();
    }

    @Override
    public String component2() {
        return getGroupName();
    }

    @Override
    public String component3() {
        return getGroupDesc();
    }

    @Override
    public LocalDateTime component4() {
        return getGroupCrtTime();
    }

    @Override
    public Integer value1() {
        return getGroupNo();
    }

    @Override
    public String value2() {
        return getGroupName();
    }

    @Override
    public String value3() {
        return getGroupDesc();
    }

    @Override
    public LocalDateTime value4() {
        return getGroupCrtTime();
    }

    @Override
    public JGroupManagementRecord value1(Integer value) {
        setGroupNo(value);
        return this;
    }

    @Override
    public JGroupManagementRecord value2(String value) {
        setGroupName(value);
        return this;
    }

    @Override
    public JGroupManagementRecord value3(String value) {
        setGroupDesc(value);
        return this;
    }

    @Override
    public JGroupManagementRecord value4(LocalDateTime value) {
        setGroupCrtTime(value);
        return this;
    }

    @Override
    public JGroupManagementRecord values(Integer value1, String value2, String value3, LocalDateTime value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JGroupManagementRecord
     */
    public JGroupManagementRecord() {
        super(JGroupManagement.GROUP_MANAGEMENT);
    }

    /**
     * Create a detached, initialised JGroupManagementRecord
     */
    public JGroupManagementRecord(Integer groupNo, String groupName, String groupDesc, LocalDateTime groupCrtTime) {
        super(JGroupManagement.GROUP_MANAGEMENT);

        set(0, groupNo);
        set(1, groupName);
        set(2, groupDesc);
        set(3, groupCrtTime);
    }
}
