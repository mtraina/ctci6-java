package chapter01;

public class Q05 {
    public static boolean isOneAway(String s1, String s2){
        int l1 = s1.length();
        int l2 = s2.length();

        if(l1 == l2){
            return oneReplace(s1, s2);
        }
        else if(l1 + 1 == l2){
            return oneInsert(s1, s2);
        }
        else if(l1 - 1 == l2){
            return oneInsert(s2, s1);
        }
        else return false;
    }

    private static boolean oneReplace(String s1, String s2){
        boolean mod = false;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if(mod) return false;
                mod = true;
            }
        }
        return true;
    }

    private static boolean oneInsert(String s1, String s2){
        int index1 = 0;
        int index2 = 0;

        while(index2 < s2.length() && index1 < s1.length()){
            if(s1.charAt(index1) != s2.charAt(index2)){
                if(index1 != index2) return false;
                index2++;
            }
            else {
                index1++;
                index2++;
            }
        }
        return true;
    }
}
