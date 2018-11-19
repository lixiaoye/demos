package data_structure.arrays;

/**
 * Created by LIXIAOYE on 2018/8/6.
 */

public class RemoveDuplicateMain {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("new length==" + removeDuplicates(nums));
    }

    /**
     * 我的目标是在o(1)空间复杂度的条件下即想实现删除重复元素后的数组，然后调用length获取其长度
     * 但是忘记了最重要的一个前提条件：这个是排序数组！！！
     *
     * @param nums
     * @return
     */

    //    private static int removeDuplicates(int[] nums) {
//        int[] news = new int[0];
//        int index = 0;
//        news[index++] = nums[0];
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] != news[i]) {
//                    news[index++] = nums[j];
//                }
//            }
//        }
//        return news.length;
//    }
    // 扔进去AC了他
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        //判断无输入
        int number = 0;//标记计数
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[number]) {
//                number++;
//                nums[number] = nums[i];
                nums[++number] = nums[i];
            }
        }
        number += 1; //标记+1即为数字个数
        return number;
    }

}
