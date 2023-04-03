public class practice65 {
    static int count=0;
    double money;
    public practice65(double money){
        this.money=money;
        System.out.println("您有一笔大额消费，交易金额："+money);
        count++;
    }
    public void output(){
        System.out.println("qian"+money);
    }

    public static void main(String[] args) {
        practice65 one =new practice65(1555.0);
        practice65 two =new practice65(1920.0);
        practice65 three =new practice65(1979.0);
        practice65 four =new practice65(2259.0);
        practice65 five =new practice65(1835.0);
        practice65 six =new practice65(1799.0);
        practice65 seven =new practice65(2688.0);
        System.out.println("您最近交易"+count+"笔。");
        one.output();
        two.output();
    }
}
