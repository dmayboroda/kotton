package com.dmayboroda.kotton.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * Track of permissions, only admin can add/edit content.
 * Created by dmaiboroda on 6/17/17.
 */
@Document
data class User(
        @Id val id: String? = null,
        val username: String,
        val email: String
)

enum class Role {
    USER,
    ADMIN
}