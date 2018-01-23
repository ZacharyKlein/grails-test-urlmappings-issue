package testurlmappings

import grails.testing.web.UrlMappingsUnitTest
import spock.lang.Specification

class UrlMappingsSpec  extends Specification implements UrlMappingsUnitTest<UrlMappings> {

    void setup() {
        mockController(TestController)
    }

    void "test forward"() {
        expect: "calls to /custom/mapping to succeed" //<1>
        verifyForwardUrlMapping("/custom/mapping", controller: 'test', action: 'index')
    }

    void "test reverse"() {
        expect: "calls to /custom/mapping to succeed" //<1>
        verifyReverseUrlMapping("/custom/mapping", controller: 'test', action: 'index')
    }

    void "test both"() {
        expect: "calls to /custom/mapping to succeed" //<1>
        verifyUrlMapping("/custom/mapping", controller: 'test', action: 'index')
    }

}

