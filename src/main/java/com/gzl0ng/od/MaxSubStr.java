package com.gzl0ng.od;

/**
 * @author:郭正龙
 * @data:2023/6/2
 */

/**
 * 最大字符字串
 */
public class MaxSubStr {
    public static void main(String[] args) {
        String s = new String("abc");
        String t = new String("1abcd");

        //小字符串
        int m = s.length();
        int i = 0;

        //大字符串
        int n = t.length();
        int j = 0;
        while (i < m && j <n){
            if (s.charAt(i) == t.charAt(j)){
                i++;
            }
                j++;
        }

        System.out.println(i == m);
    }
}
