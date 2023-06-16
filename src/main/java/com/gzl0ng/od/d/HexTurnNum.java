package com.gzl0ng.od.d;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author:郭正龙
 * @data:2023/6/16
 */
public class HexTurnNum {
    @Test
    public void test01(){
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();

        String str = new String("0XAA");
        System.out.println(Integer.parseInt(str.substring(2, str.length()),16));

    }
}
