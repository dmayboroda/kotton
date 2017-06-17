package com.dmayboroda.kotton.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * Created by dmaiboroda on 6/17/17.
 */
@Document
data class User(
        @Id val id: String? = null,
        val firstname: String,
        val lastname: String,
        val email: String
)

enum class Role {
    USER,
    ADMIN
}