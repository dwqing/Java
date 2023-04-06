package Leetcode;

import java.util.HashSet;
import java.util.Set;


//自己写的，不想用双循环一点bug'
public class repeatedArray {
    public int findRepeatNumber(int[] nums) {
        int j=0,i=1;
        if (nums == null) return -1;
        while (j<nums.length){
            if (nums[j] == nums[i]){
                i = ++j;
                return nums[j-1];
            }
            if (i==nums.length-1){
                i = ++j;
            }
            i++;
        }
        return -1;
    }


    //原地交换
    public int findRepeatNumber2(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if(nums[i] == i) {
                i++;
                continue;
            }
            if(nums[nums[i]] == nums[i]) return nums[i];
            int tmp = nums[i];
            nums[i] = nums[tmp];
            nums[tmp] = tmp;
        }
        return -1;
    }
    //哈希表
    public int findRepeatNumber3(int[] nums) {
        Set<Integer> dic = new HashSet<>();
        for(int num : nums) {
            if(dic.contains(num)) return num;
            dic.add(num);
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] a = {2, 3, 1, 0, 2, 5, 3};
        repeatedArray repeatedArray = new repeatedArray();
        System.out.println(repeatedArray.findRepeatNumber3(a));
    }
}
