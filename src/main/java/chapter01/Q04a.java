package chapter01;

public class Q04a {
    public static boolean isPalindromePermutation(String string){
        int[] cs = charsPresence(string);
        int odds = oddsCount(cs);

        return (odds <= 1);
    }

    static int[] charsPresence(String string){
        int[] cs = new int[27];
        for(int i = 0; i < string.length(); i++){
            char c = string.charAt(i);
            if(c == ' '){
                cs[26]++;
            } else {
                cs[c - 97]++;
            }
        }
        return cs;
    }

    static int oddsCount(int[] cs){
        int odds = 0;
        for(int i = 0; i < cs.length - 1; i++){
            if(cs[i] % 2 == 1) odds++;
        }
        return odds;
    }
}
