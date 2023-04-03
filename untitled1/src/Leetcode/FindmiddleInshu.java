package Leetcode;

import java.util.Arrays;

public class FindmiddleInshu {
    //寻找中位数

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int all[] = Arrays.copyOf(nums1,nums1.length+nums2.length);
        System.arraycopy(nums2,0,all,nums1.length,nums2.length);

        Arrays.parallelSort(all);
        if (all.length%2 != 0){
            return (double) all[all.length/2];
        }
        else return (double) (all[all.length/2-1]+all[all.length/2])/2;

    }

    public static void main(String[] args) {
        FindmiddleInshu findmiddleInshu = new FindmiddleInshu();
        double result;
        int[] a = {1,3};
        int[] b = {2,4};
        result = findmiddleInshu.findMedianSortedArrays(a,b);
        System.out.println(result);
    }


}
