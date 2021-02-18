package com.example.demo

import com.example.demo.api.User
import com.example.demo.api.UserSecret
import com.example.demo.db.jooq.generated.tables.Users
import com.example.demo.db.jooq.generated.tables.Usersecrets
import org.jooq.DSLContext
import org.jooq.impl.DSL
import org.jooq.impl.DefaultConfiguration
import org.springframework.context.annotation.Configuration
import java.sql.DriverManager
import javax.annotation.PostConstruct
import kotlin.random.Random

@Configuration
class DataBaseTest {
    @PostConstruct
    fun setup() {
        val connection =
            DriverManager.getConnection("jdbc:sqlite:sqlite.db") ?: error("Unable to init data base")

        val context: DSLContext = DSL.using(
            DefaultConfiguration()
                .set(connection))

        val user = User("test2" + Random.nextInt(), "test", "heuu", "", listOf("ADMIN"))
        context.newRecord(Users.USERS, user).store()
        val users = context.selectFrom(Users.USERS).fetchAny()?.into(User::class.java)

        context.newRecord(Usersecrets.USERSECRETS, UserSecret("user" + Random.nextInt(), "secte", "aaa")).store()
        val into = context.selectFrom(Usersecrets.USERSECRETS).fetchAny()?.into(UserSecret::class.java)

        println("$users $into")
    }
}
