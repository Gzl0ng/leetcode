package com.gzl0ng.od.d;

import org.junit.Test;

import java.util.Map;
import java.util.Scanner;

/**
 * @author:郭正龙
 * @data:2023/6/16
 */
public class PrimeFactor {
    @Test
    public void test01(){
//        Scanner sc = new Scanner(System.in);
//        long num = sc.nextLong();

        int num = 180;
        long k = (long)Math.sqrt(num);

        for (int i = 2; i < k; i++) {
            while (num%i ==0){
                System.out.print(i + " ");
                num/=i;
            }
        }
        System.out.println(num==1?"":num+"");
    }
}
