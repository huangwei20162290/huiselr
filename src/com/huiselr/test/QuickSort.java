package com.huiselr.test;

import java.util.Random;

/**
 * 快速排序：
 * 选取基准值(一般左边第一个值)，
 * 然后先从右边(先从右边，先从右边，先从右边)开始找到小于基准值的值，记录位置j
 * 再然后从左边开始找到大于基准值的值，记录位置为i。然后交换两值的位置(i，j指向位置不变)
 * 继续从右开始上面的动作直到i==j为止，然后基准值与i的值交换位置
 * 然后再将基准值此时位置的左边和右边的数组递归上面的动作直到整个数组都是有序的
*/
public class QuickSort {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] is=new Integer[20000];
        for (int a=0;a<20000;a++){
            is[a]=random.nextInt(100);
        }
        /*Integer[] is={6,1,2,7,9,3,4,5,10,8,2,5,7,9};*/
        long start = System.currentTimeMillis();
        quickSort(is,0,is.length-1);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        for (int s: is) {
            System.out.print(s);
            System.out.print(" ");
        }
    }
    /**
     * @param arrays 传递的数据
     * @param left   第一个数据的索引
     * @param right  最后一个数据的索引
     */
    public static void quickSort(Integer[] arrays, int left, int right) {
        if (arrays == null || arrays.length <= 0) {
            return;
        }
        /*判断下标是否越界*/
        if (left > right){
            return;
        }
        /*快速排序的基准值*/
        int temp = arrays[left];
        /*全局变量l,r*/
        int l = left;
        int r = right;
        while (l < r) {
            /*从右边开始,查找比基准值小的索引,然后返回索引*/
            while (arrays[r] >= temp && l < r) {
                r--;
            }
            /*从左边开始,查找比基准值大的索引,然后返回索引*/
            while (arrays[l] <= temp && l < r) {
                l++;
            }
            /*交换右边和左边的数*/
            if (l < r) {
                int t = arrays[l];
                arrays[l] = arrays[r];
                arrays[r] = t;
            }
        }
        /*判断两个指针相遇时,更换基准值,以基准值为界,得到左右两个数组,再分别递归调用这两个数组*/
        if(arrays[l]==arrays[r]){
            arrays[left] = arrays[r];
            arrays[r] = temp;
            quickSort(arrays, left, l - 1);
            quickSort(arrays, l + 1, right);
        }
    }
}