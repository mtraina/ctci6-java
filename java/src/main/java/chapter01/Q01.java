package chapter01;

import java.util.HashSet;
import java.util.Set;

public class Q01 {
    public static boolean isUnique(String str){
        Set<Character> chars = new HashSet<>();

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(chars.contains(c)) return false;
            else chars.add(c);
        }
        return true;
    }
}
