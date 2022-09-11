package hometask2;

public class Polindrom {
    public static void main(String[] args) {
        int i = 2001;
        System.out.println(isPolindrom(i) ? true : false);
    }

    private static boolean isPolindrom (int x){
        String str = String.valueOf(x);
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            if(str.charAt(start++) != str.charAt(end--))
                return false;
        }
        return true;
    }
}
