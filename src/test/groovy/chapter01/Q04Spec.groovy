package chapter01

import spock.lang.Specification
import spock.lang.Unroll

class Q04Spec extends Specification {

    @Unroll
    def "should return #expected when testing if #string is a palindrome permutation"(){
        expect:
        Q04.isPalindromePermutation(string) == expected

        where:
        string      | expected
        'abc'       | false
        'aann'      | true
        'accd ae'   | false
        'taco cat'  | true
    }
}
