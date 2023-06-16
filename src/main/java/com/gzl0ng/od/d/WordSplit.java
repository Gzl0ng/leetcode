package com.gzl0ng.od.d;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

/**
 * @author:郭正龙
 * @data:2023/6/16
 */
public class WordSplit {
    @Test
    public void test01(){
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();

        String str = new String("asdasfafasfsad");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        int length = str.length();
        int addZero = 8 - length % 8;
        while ((addZero>0)&&(addZero<8)){
            sb.append("0");
            addZero--;
        }
        String result = sb.toString();
        while (result.length()>0){
            System.out.println(result.substring(0,8));
            result = result.substring(8);
        }
    }


    @Test
    public void test02(){

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
//            String str = sc.nextLine();
            String str = new String("asdasfafasfsad");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            int length = str.length();
            int addZero = 8 - length % 8;
            while ((addZero>0)&&(addZero<8)){
                sb.append("0");
                addZero--;
            }
            String result = sb.toString();
            while (result.length()>0){
                System.out.println(result.substring(0,8));
                result = result.substring(8);
            }
        }

    }
}
