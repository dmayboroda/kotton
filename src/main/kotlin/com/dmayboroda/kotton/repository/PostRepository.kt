package com.dmayboroda.kotton.repository

import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.stereotype.Repository

/**
 * Retrieving posts data.
 * Created by dmaiboroda on 6/17/17.
 */

@Repository
class PostRepository(val template: ReactiveMongoTemplate) {

}