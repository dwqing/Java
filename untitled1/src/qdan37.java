import java.util.Arrays;
import java.util.Scanner;

public class qdan37 {
    public static void main(String[]args)
    {
        Scanner in =new Scanner(System.in);
        System.out.println("How many numbers you need to draw? ");
        int k=in.nextInt();

        System.out.println("What is the highest number you can draw？");
        int n=in.nextInt();

        int[] numbers=new int[n];
        for (int i=0;i<numbers.length;i++)
            numbers[i]=i+1;
        int[] result=new int[k];
        for (int i=0;i<result.length;i++)
        {
            int r=(int) (Math.random()*n);
            result[i]=numbers[r];
            numbers[r]=numbers[n-1];
            n--;
        }
        Arrays.sort(result);
        System.out.println("Bet the following combination.It`ll make you ricg!");
        for (int r:result)
        {
            System.out.println(r);
        }
    }

}
