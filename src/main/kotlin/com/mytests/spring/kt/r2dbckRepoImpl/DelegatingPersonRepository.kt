package com.mytests.spring.kt.r2dbckRepoImpl

import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux

@Repository
open class DelegatingPersonRepository (private val repo: PersonRepository) :
  PersonRepository by repo {

  override fun findByAgeAfter(age: Int, name: String): Flux<Person> {
    println("...........................................")
    return repo.findAllByFirstNameContains(name).concatWith(repo.findAllByLastNameContains(name).filter { p -> p.age!! > age });
  }

  override fun findByAddressContains(address: String): Flux<Person> {
    return repo.findByAddressContains(address).filter{ p -> p.age!! > 18 }
  }
}


