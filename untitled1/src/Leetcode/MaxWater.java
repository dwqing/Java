package Leetcode;

public class MaxWater {

    //方法超时
    public int maxArea1(int[] height) {

        int max = 0;
        for (int i=0;i<height.length;i++){
            for (int j=0;j<height.length;j++){
                if (AbsoluteValue(i,j)*Math.min(height[i],height[j])>max){
                    max = AbsoluteValue(i,j)*Math.min(height[i],height[j]);
                }
            }
        }
        return max;

    }
    public int AbsoluteValue(int x,int y){
        if (x>y) return x-y;
        else return y-x;
    }
    public int maxArea(int[] height){
        int  max = 0;
        int j = 0,i = height.length-1;
        while (j<i){
            if (height[j]>height[i]) {
                max = Math.max(max,(i-j)*height[i--]);
            }
            else {
                max = Math.max(max,(i-j)*height[j++]);
            }
           //上面的可以用一句话代替 max = height[j]<height[i] ? Math.max(max,(i-j)*height[j++]): Math.max(max,(i-j)*height[i--]);


        }
        return max;
    }

    public static void main(String[] args) {
        MaxWater water = new MaxWater();
        int [] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(water.maxArea1(height));
    }
}
