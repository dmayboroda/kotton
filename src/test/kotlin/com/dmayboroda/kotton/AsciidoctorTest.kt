package com.dmayboroda.kotton

import org.asciidoctor.Asciidoctor
import org.junit.Test

/**
 * Created by davidmayboroda on 6/25/17.
 */

class AsciidoctorTest {

    @Test
    fun `should run asciidoctor parser`() {
        val asciidoctor = Asciidoctor.Factory.create()

        val rawText = """
= Title page

Writing AsciiDoc is _easy_!

== Chapter 1
fas;ldjf;laskjdf
asdfjasl;dfajsldf

== Chapter 2

This is a code chapter
[source,java]
----
class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!")
    }
}
----
        """
        val string = asciidoctor.convert(rawText, emptyMap())

        print(string)
    }
}