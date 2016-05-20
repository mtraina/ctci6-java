package chapter01;

public class Q01 {
    public static boolean isUnique(String str){
        // assumption: the string is ASCII encoded
        if(str.length() > 128) return false;

        boolean[] chars = new boolean[128];

        for(int i = 0; i < str.length(); i++){
            int c = str.charAt(i);
            if(chars[c]) return false;
            else chars[c] = true;
        }
        return true;
    }
}
