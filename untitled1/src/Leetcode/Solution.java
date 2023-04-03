package Leetcode;

import static java.lang.String.valueOf;

public class Solution {

    /**
     * 回文数
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        String s = valueOf(x);
       String s1 = new StringBuffer(s).reverse().toString();
       if (s.equals(s1))
           return true;
       else return false;
    }

    /**
     * 字符串转换整数 (atoi)
     */
    public static int myAtoi(String s){
        int sign = 1;
        int res = 0;
        int m = s.length();
        int i = 0;
        while(i < m && s.charAt(i)==' '){
            i++;
        }
        int start = i;
        for(; i < m; i++){
            char c = s.charAt(i);
            if(i==start && c=='+'){
                sign = 1;
            }else if(i==start && c=='-'){
                sign = -1;
            }else if(Character.isDigit(c)){
                int num = c-'0'; //得到第一个数
                if(res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10&&num>Integer.MAX_VALUE%10)){
                    return Integer.MAX_VALUE;
                }

                if(res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE/10&&-num<Integer.MIN_VALUE%10)){
                    return Integer.MIN_VALUE;
                }
                res = res*10+sign*num;
            }else{
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi(" -42 A沙克斯积分kas"));
    }




}
