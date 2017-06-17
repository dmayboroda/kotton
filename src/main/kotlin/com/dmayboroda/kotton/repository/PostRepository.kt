package com.dmayboroda.kotton.repository

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.stereotype.Repository

/**
 * Created by dmaiboroda on 6/17/17.
 */
@Repository
class PostRepository(val template: ReactiveMongoTemplate,
                     val objectMapper: ObjectMapper) {

}