package com.gzl0ng.od;

import org.junit.jupiter.api.Test;

/**
 * @author:郭正龙
 * @data:2023/6/14
 */
public class SpialMatrixNum {
    @Test
    public void test02(){
        int n = 3;

        int num = 1;
        int[][] matrix = new int[n][n];
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        while (left <= right && top <= bottom) {
            for (int column = left; column <= right; column++) {
                matrix[top][column] = num;
                num++;
            }
            for (int row = top + 1; row <= bottom; row++) {
                matrix[row][right] = num;
                num++;
            }
            if (left < right && top < bottom) {
                for (int column = right - 1; column > left; column--) {
                    matrix[bottom][column] = num;
                    num++;
                }
                for (int row = bottom; row > top; row--) {
                    matrix[row][left] = num;
                    num++;
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }

        //获取行数
        int hight = matrix.length;
        //获取列数
        int width = matrix[0].length;

        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
