public class pool2 {
    public static int water =0;
    public static void outlet()
    {
        if (water>2) water=water-2;
        else water=0;
    }
    public  static void inlet()
    {
        water=water+3;
    }

    public static void main(String[] args) {
        System.out.println("水池的水量"+pool2.water);
        System.out.println("给水池注水两次");
        pool2.inlet();
        pool2.inlet();
        System.out.println("水池的水量"+pool2.water);
        System.out.println("放水一次");
        pool2.outlet();
        System.out.println("水池的水量"+pool2.water);
    }
}
