package Leetcode;

public class HiddenArray {

    //超时
    public int numberOfArrays(int[] differences, int lower, int upper) {

        int start = lower;
        int result = 0;
        boolean o = false;
        int[] hidden = new int[differences.length + 1];

        while (start <= upper) {
            hidden[0] = start;
            for (int i = 0; i < differences.length; i++) {
                hidden[i + 1] = hidden[i] + differences[i];
                if (!(hidden[i + 1] >= lower && hidden[i + 1] <= upper)) {
                    o = false;
                    break;
                } else o = true;
            }
            if (o) result++;
            start++;
        }
        return result;

    }

    public int numberOfArrays2(int[] differences, int lower, int upper) {
        int max = 0, min = 0, a = 0, d = upper - lower;
        for (int i=0;i<differences.length;i++){
         a+=differences[i];
         min = Math.min(a,min);
         max = Math.max(a,max);
            if (max-min>d)
                return 0;
        }

        return d-max+min+1;
    }
    //判断出差，可能是数值大小问题
    public int numberOfArrays3(int[] differences, int lower, int upper) {
        int max = 0, min = 0, a = 0, d = upper - lower;
        for (int i=0;i<differences.length;i++){
            a+=differences[i];
            min = Math.min(a,min);
            max = Math.max(a,max);

        }
        if (max-min>d)
            return 0;
        else return d-max+min+1;
    }

    public static void main(String[] args) {
        int[] text = {4, -7, 2};
        HiddenArray hiddenArray = new HiddenArray();
        System.out.println(hiddenArray.numberOfArrays2(text, 3, 6));
    }
}
