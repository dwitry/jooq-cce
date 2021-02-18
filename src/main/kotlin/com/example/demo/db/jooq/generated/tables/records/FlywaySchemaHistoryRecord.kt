/*
 * This file is generated by jOOQ.
 */
package com.example.demo.db.jooq.generated.tables.records


import com.example.demo.db.jooq.generated.tables.FlywaySchemaHistory

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record10
import org.jooq.Row10
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class FlywaySchemaHistoryRecord() : UpdatableRecordImpl<FlywaySchemaHistoryRecord>(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY), Record10<Int?, String?, String?, String?, String?, Int?, String?, String?, Int?, Boolean?> {

    var installedRank: Int?
        set(value) = set(0, value)
        get() = get(0) as Int?

    var version: String?
        set(value) = set(1, value)
        get() = get(1) as String?

    var description: String?
        set(value) = set(2, value)
        get() = get(2) as String?

    var type: String?
        set(value) = set(3, value)
        get() = get(3) as String?

    var script: String?
        set(value) = set(4, value)
        get() = get(4) as String?

    var checksum: Int?
        set(value) = set(5, value)
        get() = get(5) as Int?

    var installedBy: String?
        set(value) = set(6, value)
        get() = get(6) as String?

    var installedOn: String?
        set(value) = set(7, value)
        get() = get(7) as String?

    var executionTime: Int?
        set(value) = set(8, value)
        get() = get(8) as Int?

    var success: Boolean?
        set(value) = set(9, value)
        get() = get(9) as Boolean?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Int?> = super.key() as Record1<Int?>

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row10<Int?, String?, String?, String?, String?, Int?, String?, String?, Int?, Boolean?> = super.fieldsRow() as Row10<Int?, String?, String?, String?, String?, Int?, String?, String?, Int?, Boolean?>
    override fun valuesRow(): Row10<Int?, String?, String?, String?, String?, Int?, String?, String?, Int?, Boolean?> = super.valuesRow() as Row10<Int?, String?, String?, String?, String?, Int?, String?, String?, Int?, Boolean?>
    override fun field1(): Field<Int?> = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK
    override fun field2(): Field<String?> = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.VERSION
    override fun field3(): Field<String?> = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.DESCRIPTION
    override fun field4(): Field<String?> = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.TYPE
    override fun field5(): Field<String?> = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.SCRIPT
    override fun field6(): Field<Int?> = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.CHECKSUM
    override fun field7(): Field<String?> = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_BY
    override fun field8(): Field<String?> = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_ON
    override fun field9(): Field<Int?> = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.EXECUTION_TIME
    override fun field10(): Field<Boolean?> = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.SUCCESS
    override fun component1(): Int? = installedRank
    override fun component2(): String? = version
    override fun component3(): String? = description
    override fun component4(): String? = type
    override fun component5(): String? = script
    override fun component6(): Int? = checksum
    override fun component7(): String? = installedBy
    override fun component8(): String? = installedOn
    override fun component9(): Int? = executionTime
    override fun component10(): Boolean? = success
    override fun value1(): Int? = installedRank
    override fun value2(): String? = version
    override fun value3(): String? = description
    override fun value4(): String? = type
    override fun value5(): String? = script
    override fun value6(): Int? = checksum
    override fun value7(): String? = installedBy
    override fun value8(): String? = installedOn
    override fun value9(): Int? = executionTime
    override fun value10(): Boolean? = success

    override fun value1(value: Int?): FlywaySchemaHistoryRecord {
        this.installedRank = value
        return this
    }

    override fun value2(value: String?): FlywaySchemaHistoryRecord {
        this.version = value
        return this
    }

    override fun value3(value: String?): FlywaySchemaHistoryRecord {
        this.description = value
        return this
    }

    override fun value4(value: String?): FlywaySchemaHistoryRecord {
        this.type = value
        return this
    }

    override fun value5(value: String?): FlywaySchemaHistoryRecord {
        this.script = value
        return this
    }

    override fun value6(value: Int?): FlywaySchemaHistoryRecord {
        this.checksum = value
        return this
    }

    override fun value7(value: String?): FlywaySchemaHistoryRecord {
        this.installedBy = value
        return this
    }

    override fun value8(value: String?): FlywaySchemaHistoryRecord {
        this.installedOn = value
        return this
    }

    override fun value9(value: Int?): FlywaySchemaHistoryRecord {
        this.executionTime = value
        return this
    }

    override fun value10(value: Boolean?): FlywaySchemaHistoryRecord {
        this.success = value
        return this
    }

    override fun values(value1: Int?, value2: String?, value3: String?, value4: String?, value5: String?, value6: Int?, value7: String?, value8: String?, value9: Int?, value10: Boolean?): FlywaySchemaHistoryRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        this.value8(value8)
        this.value9(value9)
        this.value10(value10)
        return this
    }

    /**
     * Create a detached, initialised FlywaySchemaHistoryRecord
     */
    constructor(installedRank: Int? = null, version: String? = null, description: String? = null, type: String? = null, script: String? = null, checksum: Int? = null, installedBy: String? = null, installedOn: String? = null, executionTime: Int? = null, success: Boolean? = null): this() {
        this.installedRank = installedRank
        this.version = version
        this.description = description
        this.type = type
        this.script = script
        this.checksum = checksum
        this.installedBy = installedBy
        this.installedOn = installedOn
        this.executionTime = executionTime
        this.success = success
    }
}
