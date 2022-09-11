package hometask2;

public class LengthofLastWord {
    public static int lengthOfLastWord(String s) {
        int count = 0;
        s = s.trim();
        int start = s.length() - 1;

        for(int i=start; i >= 0; i--){
            if(s.charAt(i) == ' '){
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hello world"));

    }

}
