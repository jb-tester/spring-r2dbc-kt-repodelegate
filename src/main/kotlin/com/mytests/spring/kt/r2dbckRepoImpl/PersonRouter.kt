package com.mytests.spring.kt.r2dbckRepoImpl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router

/**
 **
 * <p>Created by irina on 14.09.2021.</p>
 * <p>Project: spring-r2dbc-kt-repoimpl</p>
 **
 */
@Configuration
open class PersonRouter {

    
    @Autowired
    private lateinit var repo: DelegatingPersonRepository

    @Bean
    open fun byNamePatternAndAge(): RouterFunction<ServerResponse> {
        return router{
            GET("/byNamePatternAndAge/{age}/{name}")
            { req -> ok().body(repo.findByAgeAfter(req.pathVariable("age").toInt(), req.pathVariable("name")) , Person::class.java) }
        }
    }
    @Bean
    open fun byAddressFiltered(): RouterFunction<ServerResponse> {
        return router{
            GET("/byAddress/{addr}")
            { req -> ok().body(repo.findByAddressContains(req.pathVariable("addr")) , Person::class.java) }
        }
    }
}