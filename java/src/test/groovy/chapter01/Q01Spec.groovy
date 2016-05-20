package chapter01

import spock.lang.Specification
import spock.lang.Unroll

class Q01Spec extends Specification {

    @Unroll
    def "it should return #isUnique when checking for characters uniqueness on #string"(){
        expect:
        Q01.isUnique(string) == isUnique

        where:
        string  | isUnique
        ''      | true
        'abc'   | true
        'aaa'   | false
        'bbc'   | false
    }
}
