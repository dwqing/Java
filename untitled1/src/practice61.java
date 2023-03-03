public class practice61 {
    public practice61(int oilVolume,int leftOilVolume)
    {
        int addOilVolume =oilVolume - leftOilVolume;
        int time =0;
        System.out.println("即将加满油······");
        while (addOilVolume!=0){
            System.out.println("还剩余"+addOilVolume+"L,已耗时"+time+"秒。");
            addOilVolume-=2;
            time+=5;
        }
        System.out.println("还剩余"+addOilVolume+"L,已耗时"+time+"秒。");
    }
    public static void main(String[] args) {
        practice61 am=new practice61(30,6);
    }
}
