package com.dmayboroda.kotton

import org.springframework.boot.autoconfigure.SpringBootApplication
import com.dmayboroda.kotton.ext.run

/**
 * Created by dmaiboroda on 5/17/17.
 */

@SpringBootApplication
class KottonApp {
    //beans initialization
}
fun main(args: Array<String>) {
    run(KottonApp::class, *args)
}