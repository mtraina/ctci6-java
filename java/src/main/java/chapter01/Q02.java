package chapter01;

import java.util.Arrays;

public class Q02 {
    public static boolean isPermutation(String first, String second){
        return Arrays.equals(
                first.chars().boxed().sorted().toArray(),
                second.chars().boxed().sorted().toArray()
        );
    }
}
