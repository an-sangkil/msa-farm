/*
 * This file is generated by jOOQ.
 */
package com.skan.farm.domain.tables;


import com.skan.farm.domain.JNaiveItFarm;
import com.skan.farm.domain.Keys;
import com.skan.farm.domain.tables.records.JCalvesManagementRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
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
public class JCalvesManagement extends TableImpl<JCalvesManagementRecord> {

    private static final long serialVersionUID = 1910501130;

    /**
     * The reference instance of <code>naive-it-farm.calves_management</code>
     */
    public static final JCalvesManagement CALVES_MANAGEMENT = new JCalvesManagement();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JCalvesManagementRecord> getRecordType() {
        return JCalvesManagementRecord.class;
    }

    /**
     * The column <code>naive-it-farm.calves_management.entity_identification_number</code>.
     */
    public final TableField<JCalvesManagementRecord, String> ENTITY_IDENTIFICATION_NUMBER = createField(DSL.name("entity_identification_number"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>naive-it-farm.calves_management.entity_management_number</code>.
     */
    public final TableField<JCalvesManagementRecord, String> ENTITY_MANAGEMENT_NUMBER = createField(DSL.name("entity_management_number"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>naive-it-farm.calves_management.seq</code>.
     */
    public final TableField<JCalvesManagementRecord, Short> SEQ = createField(DSL.name("seq"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>naive-it-farm.calves_management.calving_date</code>.
     */
    public final TableField<JCalvesManagementRecord, LocalDateTime> CALVING_DATE = createField(DSL.name("calving_date"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>naive-it-farm.calves_management.entity_identification_number_child</code>.
     */
    public final TableField<JCalvesManagementRecord, String> ENTITY_IDENTIFICATION_NUMBER_CHILD = createField(DSL.name("entity_identification_number_child"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>naive-it-farm.calves_management.entity_management_number_child</code>.
     */
    public final TableField<JCalvesManagementRecord, String> ENTITY_MANAGEMENT_NUMBER_CHILD = createField(DSL.name("entity_management_number_child"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>naive-it-farm.calves_management.expected_date_confinement</code>.
     */
    public final TableField<JCalvesManagementRecord, LocalDateTime> EXPECTED_DATE_CONFINEMENT = createField(DSL.name("expected_date_confinement"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>naive-it-farm.calves_management.fertilization_date</code>.
     */
    public final TableField<JCalvesManagementRecord, LocalDateTime> FERTILIZATION_DATE = createField(DSL.name("fertilization_date"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>naive-it-farm.calves_management.fertilization_index</code>.
     */
    public final TableField<JCalvesManagementRecord, Short> FERTILIZATION_INDEX = createField(DSL.name("fertilization_index"), org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>naive-it-farm.calves_management.nothing_special</code>.
     */
    public final TableField<JCalvesManagementRecord, String> NOTHING_SPECIAL = createField(DSL.name("nothing_special"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>naive-it-farm.calves_management.sperm_no</code>.
     */
    public final TableField<JCalvesManagementRecord, Long> SPERM_NO = createField(DSL.name("sperm_no"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>naive-it-farm.calves_management.years</code>.
     */
    public final TableField<JCalvesManagementRecord, String> YEARS = createField(DSL.name("years"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>naive-it-farm.calves_management</code> table reference
     */
    public JCalvesManagement() {
        this(DSL.name("calves_management"), null);
    }

    /**
     * Create an aliased <code>naive-it-farm.calves_management</code> table reference
     */
    public JCalvesManagement(String alias) {
        this(DSL.name(alias), CALVES_MANAGEMENT);
    }

    /**
     * Create an aliased <code>naive-it-farm.calves_management</code> table reference
     */
    public JCalvesManagement(Name alias) {
        this(alias, CALVES_MANAGEMENT);
    }

    private JCalvesManagement(Name alias, Table<JCalvesManagementRecord> aliased) {
        this(alias, aliased, null);
    }

    private JCalvesManagement(Name alias, Table<JCalvesManagementRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> JCalvesManagement(Table<O> child, ForeignKey<O, JCalvesManagementRecord> key) {
        super(child, key, CALVES_MANAGEMENT);
    }

    @Override
    public Schema getSchema() {
        return JNaiveItFarm.NAIVE_IT_FARM;
    }

    @Override
    public UniqueKey<JCalvesManagementRecord> getPrimaryKey() {
        return Keys.KEY_CALVES_MANAGEMENT_PRIMARY;
    }

    @Override
    public List<UniqueKey<JCalvesManagementRecord>> getKeys() {
        return Arrays.<UniqueKey<JCalvesManagementRecord>>asList(Keys.KEY_CALVES_MANAGEMENT_PRIMARY);
    }

    @Override
    public List<ForeignKey<JCalvesManagementRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<JCalvesManagementRecord, ?>>asList(Keys.FKBTDOIJOBJ7F4J74YLOXQ3X8KA, Keys.FK6EMEBSP37XCSESP63XU8DHGDH);
    }

    public JLocalBeefManagement fkbtdoijobj7f4j74yloxq3x8ka() {
        return new JLocalBeefManagement(this, Keys.FKBTDOIJOBJ7F4J74YLOXQ3X8KA);
    }

    public JLocalBeefManagement fk6emebsp37xcsesp63xu8dhgdh() {
        return new JLocalBeefManagement(this, Keys.FK6EMEBSP37XCSESP63XU8DHGDH);
    }

    @Override
    public JCalvesManagement as(String alias) {
        return new JCalvesManagement(DSL.name(alias), this);
    }

    @Override
    public JCalvesManagement as(Name alias) {
        return new JCalvesManagement(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JCalvesManagement rename(String name) {
        return new JCalvesManagement(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JCalvesManagement rename(Name name) {
        return new JCalvesManagement(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<String, String, Short, LocalDateTime, String, String, LocalDateTime, LocalDateTime, Short, String, Long, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}
