package chapter01;

public class Q05 {
    public static boolean isOneAway(String s1, String s2){
        int l1 = s1.length();
        int l2 = s2.length();

        // more then char added/removed
        if(l2 < l1 - 1 || l2 > l1 + 1) return false;

        // get the smallest length
        int l = l1 <= l2 ? l1 : l2;
        boolean mod = false;
        char p1 = s1.charAt(0);
        char p2 = s2.charAt(0);

        for(int i = 0; i < l ; i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if(c1 == c2){
                p1 = c1;
                p2 = c2;
                continue;
            }
            if(!mod){
                mod = true;
                p1 = c1;
                p2 = c2;
                continue;
            }
            if(c1 == p2 || c2 == p1){
                p1 = c1;
                p2 = c2;
                continue;
            }
            return false;
        }
        return true;
    }
}
