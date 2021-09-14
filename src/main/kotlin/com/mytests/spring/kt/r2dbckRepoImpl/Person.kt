package com.mytests.spring.kt.r2dbckRepoImpl

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column

class Person {
    @get:Column("id")
    @get:Id
    var id: Long? = null

    @get:Column("first_name")
    var firstName: String? = null

    @get:Column("last_name")
    var lastName: String? = null

    @get:Column("address")
    var address: String? = null
    
    @get:Column("age")
    var age: Int? = null
    override fun toString(): String {
        return "Person: " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                ' '
    }
}