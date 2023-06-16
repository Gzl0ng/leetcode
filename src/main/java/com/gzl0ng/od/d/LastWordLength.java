package com.gzl0ng.od.d;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

/**
 * @author:郭正龙
 * @data:2023/6/16
 */
public class LastWordLength {
    @Test
    public void test01(){
        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();

        String str = new String("aa ll hello wordsa");
        String[] list = str.split(" ");
        System.out.println(list[list.length -1 ].length());
    }

    @Test
    public void test02(){
        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();

        String str = new String("aa ll hello wordsa");

        int count = 0;
        for (int i = str.length()-1; i >=0 ; i--) {
            if (str.charAt(i) == ' '){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
