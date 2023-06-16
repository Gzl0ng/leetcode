package com.gzl0ng.od.d;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

/**
 * @author:郭正龙
 * @data:2023/6/16
 */
public class WordShowCount {
    @Test
    public void test01(){
        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String s = sc.nextLine();

        String str = new String("Asda@!35A");
        String s = new String("A");

        System.out.println(str.length() - str.replaceAll(s,"").length());
    }
}
