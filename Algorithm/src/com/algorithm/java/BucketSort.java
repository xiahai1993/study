package com.algorithm.java;

import java.util.Arrays;
/**
 * 桶排序：java
 * @author sharier
 * @date 2018/10/10
 */
public class BucketSort {

    /**
     * 桶排序
     * @param a 待排序的数组
     * @param max 数组中的最大值+1
     */
    public static void bucketSort(int [] a,int max){
        int [] buckets;
        if(a == null && max == 1)
            return;
        buckets = new int[max];
        for (int i = 0; i < a.length; i++)
            buckets[a[i]]++;
        for (int i = 0,j = 0; i < max; i++) {
            while(buckets[i]-->0) {
                a[j++] = i;
            }
        }
        buckets = null;
    }
    public static void main(String[] args) {
        int i;
        int a[] = {8,2,3,4,3,6,6,3,9};

        System.out.printf("before sort:");
        for (i=0; i<a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.printf("\n");

        bucketSort(a, Arrays.stream(a).max().getAsInt()+1); // 桶排序

        System.out.printf("after  sort:");
        for (i=0; i<a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.printf("\n");
    }
}
