/*
 * This file is generated by jOOQ.
 */
package com.example.demo.db.jooq.generated.tables


import com.example.demo.db.jooq.generated.DefaultSchema
import com.example.demo.db.jooq.generated.keys.PK_USERS
import com.example.demo.db.jooq.generated.tables.records.UsersRecord

import kotlin.collections.List

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.JSON
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row5
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Users(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, UsersRecord>?,
    aliased: Table<UsersRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<UsersRecord>(
    alias,
    DefaultSchema.DEFAULT_SCHEMA,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>users</code>
         */
        val USERS = Users()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<UsersRecord> = UsersRecord::class.java

    /**
     * The column <code>users.id</code>.
     */
    val ID: TableField<UsersRecord, String?> = createField(DSL.name("id"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>users.name</code>.
     */
    val NAME: TableField<UsersRecord, String?> = createField(DSL.name("name"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>users.description</code>.
     */
    val DESCRIPTION: TableField<UsersRecord, String?> = createField(DSL.name("description"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>users.secretType</code>.
     */
    val SECRETTYPE: TableField<UsersRecord, String?> = createField(DSL.name("secretType"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>users.roles</code>.
     */
    val ROLES: TableField<UsersRecord, JSON?> = createField(DSL.name("roles"), SQLDataType.JSON, this, "")

    private constructor(alias: Name, aliased: Table<UsersRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<UsersRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>users</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>users</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>users</code> table reference
     */
    constructor(): this(DSL.name("users"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, UsersRecord>): this(Internal.createPathAlias(child, key), child, key, USERS, null)
    override fun getSchema(): Schema = DefaultSchema.DEFAULT_SCHEMA
    override fun getPrimaryKey(): UniqueKey<UsersRecord> = PK_USERS
    override fun getKeys(): List<UniqueKey<UsersRecord>> = listOf(PK_USERS)
    override fun `as`(alias: String): Users = Users(DSL.name(alias), this)
    override fun `as`(alias: Name): Users = Users(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Users = Users(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Users = Users(name, null)

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row5<String?, String?, String?, String?, JSON?> = super.fieldsRow() as Row5<String?, String?, String?, String?, JSON?>
}
