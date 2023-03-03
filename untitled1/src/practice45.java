public class practice45 {
    public static void main(String[] args) {
        int height =10;
        int heightDay=2;
        int heightNight=1;
        int time=1;
        loop:while (height>0)
        {
            height=height-heightDay;
            if(height<=0) break loop;
            height=height+heightNight;
            time++;
        }
        System.out.println(time+"天");
    }
}
