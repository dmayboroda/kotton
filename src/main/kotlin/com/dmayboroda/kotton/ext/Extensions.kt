package com.dmayboroda.kotton.ext

import org.springframework.boot.SpringApplication
import kotlin.reflect.KClass

/**
 * Extension functions
 * Created by davidmayboroda on 5/29/17.
 */
fun run(type: KClass<*>, vararg args: String) = SpringApplication.run(type.java, *args)