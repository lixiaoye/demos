package leetcode.threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by LIXIAOYE on 2018/8/4.
 */

public class ThreeSumDemo {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = threeSum(nums);
        for (int i = 0; i < lists.size(); i++) {
            System.out.print(lists.get(i));
        }

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        //1.先剔除重复元素
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        Object[] tmp = set.toArray();
        int[] newNums = new int[tmp.length];
        for (int i = 0; i < tmp.length; i++) {
            newNums[i] = (int) tmp[i];
        }
        nums = newNums;
        //12.再分组三个数分组
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        int key = 0;
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                for (int k = j + 1; k < nums.length - 1; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        ArrayList<Integer> ll = new ArrayList<>();
                        ll.add(nums[i]);
                        ll.add(nums[j]);
                        ll.add(nums[k]);
                        Arrays.sort(new ArrayList[]{ll});
//                        int[] l = new int[3];
//                        l[0] = nums[i];
//                        l[1] = nums[j];
//                        l[2] = nums[k];
//                        Arrays.sort(l);
                        list.add(key++, ll);
                    }
                }
            }
        }
        return list;

    }
}
