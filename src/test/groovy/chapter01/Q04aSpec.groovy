package chapter01

import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class Q04aSpec extends Specification {

    def "should return #expected when testing if #string is a palindrome permutation"(){
        expect:
        Q04a.isPalindromePermutation(string) == expected

        where:
        string      | expected
        'accd ae'   | false
        'taco cat'  | true
    }
}
