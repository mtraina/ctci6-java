package chapter01;

public class Q03 {
    public static String urlify(String string){
        int newLength = urlifiedLength(string);

        if(newLength == string.length()) return string;

        char[] urlifiedChars = new char[newLength];
        int j = 0;
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == ' '){
                urlifiedChars[j] = '%';
                urlifiedChars[j+1] = '2';
                urlifiedChars[j+2] = '0';
                j += 3;
            } else {
                urlifiedChars[j] = string.charAt(i);
                j++;
            }
        }
        return String.copyValueOf(urlifiedChars);
    }

    private static int urlifiedLength(String string){
        int emptySpacesCount = 0;
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == ' ') emptySpacesCount++;
        }
        return string.length() + 2 * emptySpacesCount;
    }
}
