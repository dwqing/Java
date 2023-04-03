import java.util.Scanner;

public class practice43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入繁殖的代数");
        int n = in.nextInt();
        int i=1;int sum=1;
        while (i<=n)
        {
            sum *=2;
            i++;
        }
        System.out.println("最后细菌的个数"+sum);
    }
}
