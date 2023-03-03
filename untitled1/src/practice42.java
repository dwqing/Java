import java.util.Scanner;

public class practice42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入月份");
        int mouth = in.nextInt();
        switch (mouth){
            case 1:
            case 2:
            case 3:
                System.out.println("该月份为春季"); break;
            case 4:
            case 5:
            case 6:
                System.out.println("该月份为夏季"); break;
            case 7:
            case 8:
            case 9:
                System.out.println("该月份为秋季");break;
            case 10:
            case 11:
            case 12:
                System.out.println("该月份为冬季");break;
            default:
                System.out.println("该月份不合法");
        }
    }
}
