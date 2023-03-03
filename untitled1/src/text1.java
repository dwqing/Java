import java.util.*;
public class text1 {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int[] samllPrimes = new int[101];
        int[] LuckyNumber= samllPrimes;
        for(int i=0;i<LuckyNumber.length;i++)
            LuckyNumber[i]=in.nextInt();
        for (int element:samllPrimes
             )
        {
            System.out.println(element);
        }
    }
}
