package com.algorithm.java;

/**
 * 堆排序：java
 * @author sharier
 * @date 2018/09/29
 */
public class HeapSort {
    /**
     * (最大)堆的向下调整算法
     *
     * 注：数组实现的堆中，第N个节点的左孩子的索引值是(2N+1)，右孩子的索引是(2N+2)。
     *     其中，N为数组下标索引值，如数组中第1个数对应的N为0。
     *
     * 参数说明：
     *     a -- 待排序的数组
     *     start -- 被下调节点的起始位置(一般为0，表示从第1个开始)
     *     end   -- 截至范围(一般为数组中最后一个元素的索引)
     */
    public static void maxHeadDown(int [] a,int start,int end){
        int c = start;            // 当前(current)节点的位置
        int l = 2*c + 1;        // 左(left)孩子的位置
        int tmp = a[c];            // 当前(current)节点的大小
        for (;l <= end;c = l,l = 2*l+1){
            if (l < end && a[l] < a[l+1])
                l++;
            if(tmp >= a[l])
                break;
            else {
                a[c] = a[l];
                a[l] = tmp;
            }
        }
    }

    /**
     * 堆排序(从小到大)
     *
     * 参数说明：
     *     a -- 待排序的数组
     *     n -- 数组的长度
     */
    public static void heapSortAsc(int[] a, int n){
        int i;
        for (i = n/2-1;i >= 0;i--)
            maxHeadDown(a,i,n-1);

        for (i = n-1;i >= 0;i--){
            int tmp = a[0];
            a[0] = a[i];
            a[i] = tmp;
            maxHeadDown(a,0,i-1);
        }
    }

    public static void main(String[] args) {
        int i;
        int[] a = {20,40,30,10,60,50};

        System.out.printf("before sort:");
        for (i=0; i<a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.printf("\n");

        heapSortDesc(a,a.length);

        System.out.printf("after  sort:");
        for (i=0; i<a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.printf("\n");
    }
//-----------------------------------最小堆降序排序------------------------------------
    /**
     * (最小)堆的向下调整算法
     *
     * 注：数组实现的堆中，第N个节点的左孩子的索引值是(2N+1)，右孩子的索引是(2N+2)。
     *     其中，N为数组下标索引值，如数组中第1个数对应的N为0。
     *
     * 参数说明：
     *     a -- 待排序的数组
     *     start -- 被下调节点的起始位置(一般为0，表示从第1个开始)
     *     end   -- 截至范围(一般为数组中最后一个元素的索引)
     */
    public static void minHeapDown(int[] a, int start, int end){
        int c = start;
        int l = 2*c+1;
        int tmp = a[c];
        for (;l <= end;c=l,l = 2*l+1) {
            if (l < end && a[l] > a[l+1])
                l++;
            if(tmp <= a[l])
                break;
            else {
                a[c] = a[l];
                a[l] = tmp;
            }
        }
    }

    /**
     * 堆排序(从大到小)
     *
     * 参数说明：
     *     a -- 待排序的数组
     *     n -- 数组的长度
     */
    public static void heapSortDesc(int[] a, int n){
        int i;
        int tmp;
        for (i = n/2-1;i >= 0;i--)
            minHeapDown(a,i,n-1);
        for (i = n-1;i > 0;i--) {
            tmp = a[0];
            a[0] = a[i];
            a[i] = tmp;
            minHeapDown(a,0,i-1);
        }
    }
}
