package com.socialmaster.array;

/**
 * Created by liuxiaojun on 16/3/5.
 * 测试多维数组
 */
public class Test01 {
    public static void main(String[] args) {  //psvm
        int[][] a = {
                {1,2},
                {2,3,4,5},
                {6,7,8},
        };

        int[][] b = new int[3][];
        b[0] = new int[2];
        b[1] = new int[4];
        b[2] = new int[3];



        //矩阵运算
        int[][] c = {
                {1,2},
                {2,3}
        };
        int[][] d = {
                {1,2},
                {2,3}
        };

        int[][] e = new int[2][2];
        for (int i=0; i < c.length; i++){

            for (int j=0; j < d.length; j++){
                e[i][j] = c[i][j] + d[i][j];
            }
        }

        System.out.println(e[1][1]);




    }
}
