package Leetcode;

public class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
       String s1 = new StringBuffer(s).reverse().toString();
       if (s.equals(s1))
           return true;
       else return false;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.isPalindrome(121));

    }


}
