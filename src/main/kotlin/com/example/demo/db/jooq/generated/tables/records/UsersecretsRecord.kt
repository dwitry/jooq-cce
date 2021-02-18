/*
 * This file is generated by jOOQ.
 */
package com.example.demo.db.jooq.generated.tables.records


import com.example.demo.db.jooq.generated.tables.Usersecrets

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record3
import org.jooq.Row3
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class UsersecretsRecord() : UpdatableRecordImpl<UsersecretsRecord>(Usersecrets.USERSECRETS), Record3<String?, String?, String?> {

    var userid: String?
        set(value) = set(0, value)
        get() = get(0) as String?

    var secrettype: String?
        set(value) = set(1, value)
        get() = get(1) as String?

    var value: String?
        set(value) = set(2, value)
        get() = get(2) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<String?> = super.key() as Record1<String?>

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row3<String?, String?, String?> = super.fieldsRow() as Row3<String?, String?, String?>
    override fun valuesRow(): Row3<String?, String?, String?> = super.valuesRow() as Row3<String?, String?, String?>
    override fun field1(): Field<String?> = Usersecrets.USERSECRETS.USERID
    override fun field2(): Field<String?> = Usersecrets.USERSECRETS.SECRETTYPE
    override fun field3(): Field<String?> = Usersecrets.USERSECRETS.VALUE
    override fun component1(): String? = userid
    override fun component2(): String? = secrettype
    override fun component3(): String? = value
    override fun value1(): String? = userid
    override fun value2(): String? = secrettype
    override fun value3(): String? = value

    override fun value1(value: String?): UsersecretsRecord {
        this.userid = value
        return this
    }

    override fun value2(value: String?): UsersecretsRecord {
        this.secrettype = value
        return this
    }

    override fun value3(value: String?): UsersecretsRecord {
        this.value = value
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?): UsersecretsRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        return this
    }

    /**
     * Create a detached, initialised UsersecretsRecord
     */
    constructor(userid: String? = null, secrettype: String? = null, value: String? = null): this() {
        this.userid = userid
        this.secrettype = secrettype
        this.value = value
    }
}