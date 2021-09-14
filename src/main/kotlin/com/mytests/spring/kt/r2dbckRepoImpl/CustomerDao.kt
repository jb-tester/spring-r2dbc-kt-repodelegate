package com.mytests.spring.kt.r2dbckRepoImpl

import org.springframework.data.r2dbc.repository.R2dbcRepository
import reactor.core.publisher.Flux


interface CustomerDao: R2dbcRepository<Customer, Int> {
    fun findByNameAndAccount(name: String, account: String): Flux<Customer>

}
