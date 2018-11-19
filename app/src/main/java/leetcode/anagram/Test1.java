package leetcode.anagram;

import java.util.ArrayList;

/**
 * Created by LIXIAOYE on 2018/9/19.
 */

public class Test1 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("最大长度为：" + lengthOfLongestSubstring(s));
        ;
    }

    private static int lengthOfLongestSubstring(String s) {
        StringBuffer sb = new StringBuffer();
        if (s.length() > 0) {
            char[] ch = s.toCharArray();
            sb.append(ch[0]);
            if (s.length() >= 2) {
                if (ch[1] != ch[0]) {
                    sb.append(ch[1]);
                }
            }

            if (s.length() > 2) {//abcabcbb
                ArrayList<String> list = new ArrayList<String>();
                for (int i = 2; i < s.length(); i++) {
                    char[] c = sb.toString().toCharArray();
                    boolean flag = false;

                    for (int j = 0; j < c.length; j++) {
                        if (ch[i] == c[j]) {
                            flag = true;
                            list.add(sb.toString());//现将连续的子串存起来
                            if (j > 0) {//大于0，则将j之前的都删除；
                                sb.delete(0, j + 1);//[0,j]
//                                sb.deleteCharAt(j);//b??
                            } else {
//                                sb.deleteCharAt(j);
                                sb.delete(j, j + 1);//删除j;
                            }
                            sb.append(ch[i]);
                            break;//终止循环
                        } else {
                            flag = false;
                        }
                    }
                    if (!flag) {
                        sb.append(ch[i]);
                    }
                    if (i == s.length() - 1) {//将最后一个子串也存起来！
                        list.add(sb.toString());
                    }
                }
                //比较list集合，取出最大的子串;
                int sum = list.get(0).length();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).length() > sum) {
                        sum = list.get(i).length();
                    }
                }
                return sum;
            }
        }
        return sb.length();
    }
}
