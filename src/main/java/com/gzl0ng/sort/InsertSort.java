package com.gzl0ng.sort;

import org.junit.jupiter.api.Test;

/**
 * @author:郭正龙
 * @data:2023/6/14
 */
public class InsertSort {
//    int[] arr = new int[]{1, 2, 5, 4,3};

    @Test
    public void select(){
        int[] arr = {1, 2, 5, 4,3};
        int n = arr.length;

        for (int i = 0; i < n - 1; ++i)
        {
            //记录有序序列最后一个元素的下标
            int end = i;
            //待插入的元素
            int tem = arr[end + 1];
            //单趟排
            while (end >= 0)
            {
                //比插入的数大就向后移
                if (tem < arr[end])
                {
                    arr[end + 1] = arr[end];
                    end--;
                }
                //比插入的数小，跳出循环
                else
                {
                    break;
                }
            }
            //tem放到比插入的数小的数的后面
            arr[end  + 1] = tem;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public void xr(){

        int[] arr = {1, 2, 5, 4,3};
        int n = arr.length;
        int gap = arr.length;

        while (gap>1)
        {
            //每次对gap折半操作
            gap = gap / 2;
            //单趟排序
            for (int i = 0; i < n - gap; ++i)
            {
                int end = i;
                int tem = arr[end + gap];
                while (end >= 0)
                {
                    if (tem < arr[end])
                    {
                        arr[end + gap] = arr[end];
                        end -= gap;
                    }
                    else
                    {
                        break;
                    }
                }
                arr[end + gap] = tem;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }
    }
}
