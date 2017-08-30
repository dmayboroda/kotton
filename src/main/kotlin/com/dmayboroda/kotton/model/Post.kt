package com.dmayboroda.kotton.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

/**
 * Entity for post (Github repository updates, tech articles,
 * video content, event announcement).
 * Created by dmaiboroda on 6/17/17.
 */
@Document
data class Post(
        @Id val id: String? = null,
        val title: String,
        val content: String,
        val path: String,
        val type: Type,
        val date: LocalDateTime = LocalDateTime.now()
)

enum class Type{
    GITHUB,
    ARTICLE,
    VIDEO,
    EVENT
}