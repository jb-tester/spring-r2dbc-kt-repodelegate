package com.mytests.spring.kt.r2dbckRepoImpl

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column

class Customer {
    @get:Column("id")
    @get:Id
    var id: Int? = null

    @get:Column("name")
    var name: String? = null

    @get:Column("account")
    var account: String? = null
}
