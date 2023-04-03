import java.util.Scanner;

public class practice41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入学生的成绩");
        int n=in.nextInt();
        if (n>=90) System.out.println("优秀");
        else if (n<90&&n>=80) System.out.println("良好");
        else if (n<80&&n>=60) System.out.println("及格");
        else if (n>=0&&n<60) System.out.println("不合格");
        else System.out.println("成绩无效");
    }
}
