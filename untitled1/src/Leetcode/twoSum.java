package Leetcode;

import java.util.HashMap;

public class twoSum {
    public static int[] w(int[] nums, int target) {

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if (hashMap.containsKey(target-nums[i])){
                return new int[]{hashMap.get(target - nums[i]),i};
            }
            hashMap.put(nums[i],i);
        }
      return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = { 3,2,4};
        int t = 9;
        int[] a ;
        a = w(nums,6);
       for (int i =0;i<a.length;i++){
           System.out.println(a[i]);
       }
    }
}
