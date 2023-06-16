package com.gzl0ng.od.d;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author:郭正龙
 * @data:2023/6/16
 */
public class NumReSort {
    @Test
    public void test01(){
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        TreeSet<Object> set = new TreeSet<>();
//        for (int i = 0; i < num; i++) {
//            set.add(sc.nextInt());
//        }

        int[] list = {1, 2, 5, 6, 6, 9, 1, 1};
        TreeSet<Object> set = new TreeSet<>();
        for (int i = 0; i < list.length; i++) {
            set.add(list[i]);
        }

        Iterator<Object> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }

    }
}
