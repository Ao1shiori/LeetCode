package com.leetcode;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author: wxw24633
 * @Time: 2023/5/10  16:59
 */
public class S001 {
    @Test
    public void solution() {
        int[] nums = {2, 7, 11, 15};
        int targer = 9;
        System.out.println(Arrays.toString(twoSum(nums,targer)));
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}
