package com.gzl0ng.od;

import org.junit.jupiter.api.Test;

/**
 * @author:郭正龙
 * @data:2023/6/11
 */
public class PreWordRe {
    public static void main(String[] args) {
            String str = "abcdefd";
            String goal = "d";
    
            String result = "";
    
            int start = str.indexOf(goal);
            for (int i = start; i >= 0; i--) {
                result +=String.valueOf(str.charAt(i));
            }
            result+=str.substring(start,str.length());
            System.out.println(result);
    }
    @Test
    public void test01(){
        String word = "abcdefd";
        String ch = "d";

        int index = word.indexOf(ch);
        if (index >= 0) {
            char[] arr = word.toCharArray();
            int left = 0, right = index;
            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            word = new String(arr);
        }
        System.out.println(word);
    }

}
