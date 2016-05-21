package chapter01

import spock.lang.Specification
import spock.lang.Unroll

class Q02Spec extends Specification {
    @Unroll
    def "is #result that #second is a permutation of #first"(){
        expect:
        Q02.isPermutation(first, second) == result

        where:
        first | second | result
        ''    | ''     | true
        'abc' | 'bca'  | true
        'bbc' | 'agd'  | false
    }
}
