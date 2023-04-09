package Leetcode;

public class CutSentence {

    /**
     * 方法一截断字符串
     * @param s
     * @param k
     * @return
     */
    public static String truncateSentence(String s, int k) {
        String[] strings = s.split(" ");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=0;i<k;i++){
            if (i == k-1){
                stringBuffer.append(strings[i]);
            }else stringBuffer.append(strings[i]+" ");
        }


        return stringBuffer.toString();
    }
    public static String truncateSentence2(String s, int k){
        int times = 1,end = 0;
        for (int i=0;i<s.length();i++){
            if (!(s.charAt(i) != ' ')){
                times++;
            }
            if (times == k){
                end = i;
            }
        }
        return s.substring(0,end+1);
    }

    public static void main(String[] args) {
        System.out.println(CutSentence.truncateSentence2("Hello how are you Contestant",4));
    }
}
