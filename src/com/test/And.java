package com.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author LiuYao
 * @Honey YuQin
 * @Duration 2.0
 * @Date 2022/11/2 21:44
 * @Description 两数之和
 **/
@SuppressWarnings({"all"})
public class And {
    public static void main(String[] args) {
        int[] a = {3,2,4};
        int[] b = twoSum(a,6);
        System.out.println(Arrays.toString(b));
    }
    public static int[] twoSum(int[] nums, int target) {
      /*  int[] a = new int[2];
        for(int i = 0;i<nums.length-1;i++) {
            for (int j = i+1; j <nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    a[0] = i;
                    a[1] = j;
                    return a;
                }

            }
        }
       return a;*/
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }
}