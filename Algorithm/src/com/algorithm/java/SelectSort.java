package com.algorithm.java;

/**
 * 选择排序：java
 * @author sharier
 * @date 2018/09/28
 */
public class SelectSort {
    /**
     *
     * @param a 待排序的数组
     */
    public static void selectSort(int [] a) {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            int key = a[i];
            int posistion = i;
            for (int j = i+1; j < length; j++) {
                if (a[j] < key) {
                    key = a[j];
                    posistion = j;
                }
            }
            a[posistion] = a[i];
            a[i] = key;

        }
    }

    public static void main(String[] args) {
        int i;
        int[] a = {20,40,30,10,60,50};

        System.out.printf("before sort:");
        for (i=0; i<a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.printf("\n");

        selectSort(a);

        System.out.printf("after  sort:");
        for (i=0; i<a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.printf("\n");
    }
}
