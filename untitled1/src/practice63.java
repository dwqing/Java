public class practice63 {
    int ice;
    public practice63(){
        System.out.println("商家默认不加冰块");
    }
    public practice63(int ice){
        this.ice=ice;
        System.out.println("张三要求加"+ice+"快冰");
    }

    public static void main(String[] args) {
        practice63 kfc1 =new practice63();
        practice63 kfc2 =new practice63(2);
    }
}
