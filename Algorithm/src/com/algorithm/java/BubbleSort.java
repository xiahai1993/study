package com.algorithm.java;


/**
 * 冒泡排序：java
 * @author sharier
 * @date 2018/09/19
 */
public class BubbleSort {
    /**
     * 冒泡排序
     * @param arr 待排序数组
     * @param n 数组长度
     */
    public static void bubbleSort1(int[] arr,int n){
        int i,j;

        for (i = n-1; i >0; i--) {
            for (j = 0; j < i; j++) {
                if (arr[j+1] <= arr[j]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    /**
     * 冒泡排序(改进版)
     * @param arr 待排序数组
     * @param n 数组长度
     */
    public static void bubbleSort2(int[] arr,int n){
        int i,j;
        boolean flag;
        for (i = n-1; i > 0 ; i--) {
            flag = false;
            for (j = 0; j < i; j++) {
                if(arr[j+1] <= arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }

    }

    public static void main(String[] args) {
        int [] arr = {7,4,8,6,2,4,5,6,1,3};
        int n = arr.length;
        System.out.println("排序前：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //bubbleSort1(arr,n);
        bubbleSort2(arr,n);

        System.out.println("排序后：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
