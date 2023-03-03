public class exmple63 {
    int eggCount;
    public exmple63(int eggCount)
    {
        this.eggCount=eggCount;
    }
    public exmple63(){
        this(1);
    }

    public static void main(String[] args) {
        exmple63 cake1=new exmple63();
        System.out.println("顾客不要增加加鸡蛋，饼里面会有"+cake1.eggCount+"个鸡蛋");
        exmple63 cake2=new exmple63(4);
        System.out.println("顾客要求增加3个鸡蛋，饼里面会有"+cake2.eggCount+"个鸡蛋");
    }
}
