package singlyLink;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        String s = "babad";
//        String s="cbbd";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return "";
        }
        ArrayList<String> list = new ArrayList<>();
        String tmp = s.substring(0,1);
        StringBuffer sb=new StringBuffer();
        sb.append(tmp);
//        for (int i = 1; i < s.length(); i++) {
//            if (tmp==s)
//        }
        return "";
    }
}
