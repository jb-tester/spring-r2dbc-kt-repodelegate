package com.mytests.spring.kt.r2dbckRepoImpl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux

@Repository
open class CustomerRepository (@field : Autowired val dao: CustomerDao) : CustomerDao by dao {
 
 
 override fun findByNameAndAccount(name: String, account: String): Flux<Customer> =
  dao.findByNameAndAccount(name, account)
}