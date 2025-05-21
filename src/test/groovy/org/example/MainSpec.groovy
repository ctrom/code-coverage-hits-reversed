package org.example

import spock.lang.Specification

class MainSpec extends Specification {

    def "example test showing coverage"() {
        given:
        Main main = new Main()

        when:
        main.exampleMethod()

        then:
        true
    }
}
