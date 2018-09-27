package com.algorithm.java;

/**
 * 直接插入排序：java
 * @author sharier
 * @date 2018/09/25
 */
public class InsertSort {

    /*
     * 直接插入排序
     *
     * 参数说明：
     *     a -- 待排序的数组
     *     n -- 数组的长度
     */
    public static void insertSort(int[] a, int n) {
        int i, j, k;

        for (i = 1; i < n; i++) {

            //为a[i]在前面的a[0...i-1]有序区间中找一个合适的位置
            for (j = i - 1; j >= 0; j--)
                if (a[j] < a[i])
                    break;

            //如找到了一个合适的位置
            if (j != i - 1) {
                //将比a[i]大的数据向后移
                int temp = a[i];
                for (k = i - 1; k > j; k--)
                    a[k + 1] = a[k];
                //将a[i]放到正确位置上
                a[k + 1] = temp;
            }
        }
    }

    /**
     * 插入排序算法2
     * @date 2018/09/27
     * @param a 待排序的数组
     */
    public static void insertSort2(int[] a){
        int length = a.length;//数组长度，将这个提取出来是为了提高速度。
        int insertNum;//要插入的数
        for(int i = 1;i < length;i++){//插入的次数
            insertNum=a[i];//要插入的数
            int j = i-1;//已经排序好的序列元素个数
            while(j >= 0 && a[j] > insertNum){//序列从后到前循环，将大于insertNum的数向后移动一格
                a[j+1] = a[j];//元素移动一格
                j--;
            }
            a[j+1] = insertNum;//将需要插入的数放在要插入的位置。
        }
    }


    public static void main(String[] args) {
        int i;
        int[] a = {20,40,30,10,60,50};

        System.out.printf("before sort:");
        for (i=0; i<a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.printf("\n");

        //insertSort(a, a.length);
        insertSort2(a);

        System.out.printf("after  sort:");
        for (i=0; i<a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.printf("\n");
    }
}