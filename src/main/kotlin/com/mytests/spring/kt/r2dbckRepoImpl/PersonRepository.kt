package com.mytests.spring.kt.r2dbckRepoImpl

import org.springframework.data.r2dbc.repository.R2dbcRepository
import reactor.core.publisher.Flux


interface PersonRepository : R2dbcRepository<Person, Int> {

  
  fun findByAgeAfter(age: Int, name_pattern: String): Flux<Person>
  fun findByAddressContains(address: String): Flux<Person>;
  fun findAllByFirstNameContains(firstName: String):Flux<Person>
  fun findAllByLastNameContains(lastName: String):Flux<Person>
}