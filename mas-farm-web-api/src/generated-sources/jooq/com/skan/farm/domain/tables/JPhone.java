/*
 * This file is generated by jOOQ.
 */
package com.skan.farm.domain.tables;


import com.skan.farm.domain.JNaiveItFarm;
import com.skan.farm.domain.Keys;
import com.skan.farm.domain.tables.records.JPhoneRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JPhone extends TableImpl<JPhoneRecord> {

    private static final long serialVersionUID = 1250935700;

    /**
     * The reference instance of <code>naive-it-farm.phone</code>
     */
    public static final JPhone PHONE = new JPhone();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JPhoneRecord> getRecordType() {
        return JPhoneRecord.class;
    }

    /**
     * The column <code>naive-it-farm.phone.management_number</code>. 관리 번호
     */
    public final TableField<JPhoneRecord, Long> MANAGEMENT_NUMBER = createField(DSL.name("management_number"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "관리 번호");

    /**
     * The column <code>naive-it-farm.phone.hm_pho_no</code>.
     */
    public final TableField<JPhoneRecord, Long> HM_PHO_NO = createField(DSL.name("hm_pho_no"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>naive-it-farm.phone.phone_number</code>.
     */
    public final TableField<JPhoneRecord, String> PHONE_NUMBER = createField(DSL.name("phone_number"), org.jooq.impl.SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>naive-it-farm.phone.type</code>.
     */
    public final TableField<JPhoneRecord, String> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>naive-it-farm.phone.user_id</code>. 사용자 아이디
     */
    public final TableField<JPhoneRecord, String> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false), this, "사용자 아이디");

    /**
     * Create a <code>naive-it-farm.phone</code> table reference
     */
    public JPhone() {
        this(DSL.name("phone"), null);
    }

    /**
     * Create an aliased <code>naive-it-farm.phone</code> table reference
     */
    public JPhone(String alias) {
        this(DSL.name(alias), PHONE);
    }

    /**
     * Create an aliased <code>naive-it-farm.phone</code> table reference
     */
    public JPhone(Name alias) {
        this(alias, PHONE);
    }

    private JPhone(Name alias, Table<JPhoneRecord> aliased) {
        this(alias, aliased, null);
    }

    private JPhone(Name alias, Table<JPhoneRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> JPhone(Table<O> child, ForeignKey<O, JPhoneRecord> key) {
        super(child, key, PHONE);
    }

    @Override
    public Schema getSchema() {
        return JNaiveItFarm.NAIVE_IT_FARM;
    }

    @Override
    public UniqueKey<JPhoneRecord> getPrimaryKey() {
        return Keys.KEY_PHONE_PRIMARY;
    }

    @Override
    public List<UniqueKey<JPhoneRecord>> getKeys() {
        return Arrays.<UniqueKey<JPhoneRecord>>asList(Keys.KEY_PHONE_PRIMARY);
    }

    @Override
    public JPhone as(String alias) {
        return new JPhone(DSL.name(alias), this);
    }

    @Override
    public JPhone as(Name alias) {
        return new JPhone(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JPhone rename(String name) {
        return new JPhone(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JPhone rename(Name name) {
        return new JPhone(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, Long, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
