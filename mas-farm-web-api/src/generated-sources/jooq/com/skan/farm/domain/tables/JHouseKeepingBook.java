/*
 * This file is generated by jOOQ.
 */
package com.skan.farm.domain.tables;


import com.skan.farm.domain.Indexes;
import com.skan.farm.domain.JNaiveItFarm;
import com.skan.farm.domain.Keys;
import com.skan.farm.domain.tables.records.JHouseKeepingBookRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
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
public class JHouseKeepingBook extends TableImpl<JHouseKeepingBookRecord> {

    private static final long serialVersionUID = -1602584500;

    /**
     * The reference instance of <code>naive-it-farm.house_keeping_book</code>
     */
    public static final JHouseKeepingBook HOUSE_KEEPING_BOOK = new JHouseKeepingBook();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JHouseKeepingBookRecord> getRecordType() {
        return JHouseKeepingBookRecord.class;
    }

    /**
     * The column <code>naive-it-farm.house_keeping_book.management_no</code>. 관리번호
     */
    public final TableField<JHouseKeepingBookRecord, String> MANAGEMENT_NO = createField(DSL.name("management_no"), org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "관리번호");

    /**
     * The column <code>naive-it-farm.house_keeping_book.category_code</code>. 수입/지출 카테고리
     */
    public final TableField<JHouseKeepingBookRecord, String> CATEGORY_CODE = createField(DSL.name("category_code"), org.jooq.impl.SQLDataType.VARCHAR(5).nullable(false), this, "수입/지출 카테고리");

    /**
     * The column <code>naive-it-farm.house_keeping_book.business_day</code>.
     */
    public final TableField<JHouseKeepingBookRecord, LocalDateTime> BUSINESS_DAY = createField(DSL.name("business_day"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>naive-it-farm.house_keeping_book.amount</code>.
     */
    public final TableField<JHouseKeepingBookRecord, Long> AMOUNT = createField(DSL.name("amount"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>naive-it-farm.house_keeping_book.breakdown</code>.
     */
    public final TableField<JHouseKeepingBookRecord, String> BREAKDOWN = createField(DSL.name("breakdown"), org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>naive-it-farm.house_keeping_book.detail_contents</code>. 메모
     */
    public final TableField<JHouseKeepingBookRecord, String> DETAIL_CONTENTS = createField(DSL.name("detail_contents"), org.jooq.impl.SQLDataType.VARCHAR(256), this, "메모");

    /**
     * Create a <code>naive-it-farm.house_keeping_book</code> table reference
     */
    public JHouseKeepingBook() {
        this(DSL.name("house_keeping_book"), null);
    }

    /**
     * Create an aliased <code>naive-it-farm.house_keeping_book</code> table reference
     */
    public JHouseKeepingBook(String alias) {
        this(DSL.name(alias), HOUSE_KEEPING_BOOK);
    }

    /**
     * Create an aliased <code>naive-it-farm.house_keeping_book</code> table reference
     */
    public JHouseKeepingBook(Name alias) {
        this(alias, HOUSE_KEEPING_BOOK);
    }

    private JHouseKeepingBook(Name alias, Table<JHouseKeepingBookRecord> aliased) {
        this(alias, aliased, null);
    }

    private JHouseKeepingBook(Name alias, Table<JHouseKeepingBookRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> JHouseKeepingBook(Table<O> child, ForeignKey<O, JHouseKeepingBookRecord> key) {
        super(child, key, HOUSE_KEEPING_BOOK);
    }

    @Override
    public Schema getSchema() {
        return JNaiveItFarm.NAIVE_IT_FARM;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.HOUSE_KEEPING_BOOK_CATEGORY_CODE);
    }

    @Override
    public UniqueKey<JHouseKeepingBookRecord> getPrimaryKey() {
        return Keys.KEY_HOUSE_KEEPING_BOOK_PRIMARY;
    }

    @Override
    public List<UniqueKey<JHouseKeepingBookRecord>> getKeys() {
        return Arrays.<UniqueKey<JHouseKeepingBookRecord>>asList(Keys.KEY_HOUSE_KEEPING_BOOK_PRIMARY);
    }

    @Override
    public List<ForeignKey<JHouseKeepingBookRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<JHouseKeepingBookRecord, ?>>asList(Keys.HOUSE_KEEPING_BOOK_IBFK_1);
    }

    public JPersonalCode personalCode() {
        return new JPersonalCode(this, Keys.HOUSE_KEEPING_BOOK_IBFK_1);
    }

    @Override
    public JHouseKeepingBook as(String alias) {
        return new JHouseKeepingBook(DSL.name(alias), this);
    }

    @Override
    public JHouseKeepingBook as(Name alias) {
        return new JHouseKeepingBook(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JHouseKeepingBook rename(String name) {
        return new JHouseKeepingBook(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JHouseKeepingBook rename(Name name) {
        return new JHouseKeepingBook(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, LocalDateTime, Long, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
