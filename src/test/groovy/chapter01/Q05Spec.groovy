package chapter01

import spock.lang.Specification
import spock.lang.Unroll

class Q05Spec extends Specification {

    @Unroll
    def "expected should be #expected when checking if #string2 is one away of #string1"(){
        expect:
        Q05.isOneAway(string1, string2) == expected

        where:
        string1 | string2   || expected
        'pale'  | 'ple'     || true
        'pales' | 'pale'    || true
        'pale'  | 'bale'    || true
        'pale'  | 'bake'    || false
    }
}
