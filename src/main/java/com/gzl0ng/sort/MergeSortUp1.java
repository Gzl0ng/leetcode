package com.gzl0ng.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author:郭正龙
 * @data:2023/6/15
 *
 * 第一个优化：
 * 可以在小区间内使用插入排序。就是在判断当left == right这里使用一个区间的插入排序，当数组长度较小的时候，使用插入排序。
 *
 * 在这里我们将这个值设置为16。当数组的长度小于16的时候，就使用插入排序，提高代码执行效率。
 */
public class MergeSortUp1 {

    @Test
    public void MergeSort(){
        int nums[] = {1, 2, 5, 4, 3};
        int[] after = sortArray(nums);       //的带排序后的数组
        System.out.println(Arrays.toString(after)); //打印输出得到数组
    }

    private static int[] sortArray(int[] nums) {
        int len = nums.length;
        int[] temp = new int[len];
        mergeSort(nums,0,len-1,temp);
        return nums;
    }

    private static void mergeSort(int[] nums, int left, int right, int[] temp) {
        if (left - right < 16){//当拆分到数组长度小于16的时候，直接插入排序提高代码运行速度
            insertionSort(nums,right,left);
            return;
        }
        int mid = (left+right)/2;   //找到下次要拆分的中间值
        mergeSort(nums,left,mid,temp);//记录树左边的
        mergeSort(nums,mid+1,right,temp);//记录树右边的

        //合并两个区间
        for (int i = left; i <= right; i++) {
            temp[i] = nums[i];
//temp就是辅助列表，新列表的需要排序的值就是从辅助列表中拿到的
        }
        int i = left;       //给辅助数组里面的值标点
        int j = mid +1;
        for (int k = left; k <= right ; k++) {//k 就为当前要插入的位置
            if (i == mid + 1){
                nums[k] = temp[j];
                j++;
            }else if (j == right+1){
                nums[k] = temp[i];
                i++;
            }
            else if (temp[i] <= temp[j]){
                nums[k] = temp[i];
                i++;
            }else {
                nums[k] = temp[j];
                j++;
            }
        }
    }

    private static void insertionSort(int[] arr, int right, int left) {
        for (int i = left; i < right ; ++i) {
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
    }
}
