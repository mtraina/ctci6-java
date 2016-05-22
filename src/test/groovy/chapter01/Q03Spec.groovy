package chapter01

import spock.lang.Specification
import spock.lang.Unroll

class Q03Spec extends Specification {
    @Unroll
    def "the string #string should be URLified to #result"(){
        expect:
        Q03.urlify(string) == result

        where:
        string                          | result
        'test'                          | 'test'
        'hello world'                   | 'hello%20world'
        'looking forward to meet you'   | 'looking%20forward%20to%20meet%20you'
    }
}
