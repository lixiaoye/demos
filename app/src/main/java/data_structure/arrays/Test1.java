package data_structure.arrays;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
       /* int[] arr = {9, 8, 3, 5, 2};
        Arrays.sort(arr);//对数组排序
        int index = Arrays.binarySearch(arr, 3);//查找指定元素3
        System.out.println("数组排序后元素3的索引是：" + index);//数组排序后元素3的索引是：1*/

        /*int[] arr = {9, 8, 3, 5, 2};
        int[] copied = Arrays.copyOfRange(arr, 1, 7);
        for (int i = 0; i < copied.length; i++) {
            System.out.print(copied[i] + ",");//8,3,5,2,0,0,
        }*/


        /*int[] arr = {1, 2, 3, 4};
        Arrays.fill(arr, 8);//用8替换数组中的每一个值
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + ":" + arr[i]+" ");//0:8 1:8 2:8 3:8
        }*/

        int[] arr = {9, 8, 3, 5, 2};
        String arrStr = Arrays.toString(arr);//使用toString()方法将数组转换为字符串
        System.out.println(arrStr);//[9, 8, 3, 5, 2]

    }
}
