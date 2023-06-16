package com.gzl0ng.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author:郭正龙
 * @data:2023/6/15
 */
public class SelectSort {
    @Test
    public void StraightSort(){
        int a[] = {1, 2, 5, 4, 3};
        for (int i = 0; i < a.length; i++) {
            //注意minIndex的取值
            int minIndex = i;
            //j=i;意味着i之前的数都是有序的
            for (int j = i; j < a.length; j++) {
                if (a[j]<a[minIndex]){
                    minIndex = j;
                }
            }
            //交换，每一次循环的i都是未排序数据的第一个
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
        System.out.println(Arrays.toString(a));
    }

    @Test
    public void HeapSort(){
        int arr[] = {1, 2, 5, 4, 3};
        for(int i = arr.length - 1;i>=0;i--){
            heapAdjest(arr,i,arr.length);
        }
        for(int i = arr.length-1;i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapAdjest(arr,0,i);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void heapAdjest(int[] arr,int parent,int length){
        int temp = arr[parent];//获取到根节点的值
        int child = parent * 2 + 1;//根据根节点获取到孩子节点的位置
        while (child<length){//只要孩子节点小于整个数组的长度，我们便保持循环
            if(child+1<length&&arr[child+1]>arr[child]){//如果孩子节点的下一个位置还有数值
                //说明当前树是有右孩子节点存在的
                child++;//通过比较如果发现右孩子节点更大的话，那我们就使用右孩子节点进行之后的对比
            }
            if(temp>=arr[child]){//如果我们发现根节点的值大于更大的那个孩子节点，那么我们就直接退出
                break;
            }
            arr[parent] = arr[child];//否则我们进行一次交换，我们直接将孩子节点的值赋值给根节点
            parent = child;//然后我们让parent的位置直接等于child，这里相当于交换，因为我们已经保存了parent的值了
            //实际上这里就是我们上面所说的根节点下放
            child = parent * 2 + 1;//之后我们让孩子节点也跟随根节点进行更新，以便进入下一轮循环
        }
        arr[parent] = temp;//我们最终将temp的值放在当前的parent指针上
    }

}