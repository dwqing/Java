import java.util.Scanner;

public class practice44 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("斐波那契数列的第几项");
        int n= in.nextInt();
        int[] arr=new int[n];
        arr[0]=1;
        arr[1]=1;
        for (int i=2;i<n;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println("斐波那契数列的第"+ n+ "项为"+arr[n-1]);
    }
}
