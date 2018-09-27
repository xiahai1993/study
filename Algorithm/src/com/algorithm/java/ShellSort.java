package com.algorithm.java;

/**
 * 希尔排序：java
 * @author sharier
 * @date 2018/09/27
 */
public class ShellSort {
    /**
     * ShellSort
     * @param a 待排序的数组
     */
    public static void shellSort(int[] a){
        int d = a.length;
        while (d!=0){
            d=d/2;
            for (int x = 0; x < d; x++) {
                for (int i = x+d; i < a.length; i += d) {
                   int j = i - d;
                   int temp = a[i];
                   while(j >= 0 && a[j] > temp){
                       a[j+d] = a[j];
                       j-=d;
                   }
                   a[j+d] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int i;
        int[] a = {20,40,30,10,60,50};

        System.out.printf("before sort:");
        for (i=0; i<a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.printf("\n");

        shellSort(a);

        System.out.printf("after  sort:");
        for (i=0; i<a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.printf("\n");
    }

}
