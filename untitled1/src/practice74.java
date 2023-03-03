public class practice74 {
    static double ratio =2.54;
    public static  double transferCM(double cm){
        double inch =cm/ratio;
        return inch;
    }
    public  static  double transferINCH(double inch)
    {
        double cm =inch*ratio;
        return cm;
    }

    public static void main(String[] args) {
        System.out.println("10厘米转化为英寸的结果为："+practice74.transferCM(10));
        System.out.println("10英寸转化为厘米的结果为："+practice74.transferINCH(10));
    }
}
