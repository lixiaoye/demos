package data_structure.arrays;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {9, 8, 3, 5, 2};//初始化一个数据
        System.out.println("排序前：");
        printArray(arr);//[9,8,3,5,2]
        Arrays.sort(arr);
        System.out.println("排序后：");
        printArray(arr);//[2,3,5,8,9]
    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.println(arr[i] + "]");
            }
        }
    }
}
