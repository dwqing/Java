public class practice71 {
    public static double add(double a,double b)
    {
        return  a+b;
    }
    public  static double minus(double a,double b){
        return a-b;
    }
    public  static  double multiply(double x,double y){
        return x*y;
    }
    public  static  double divide (double x,double y){
        return x/y;
    }

    public static void main(String[] args) {
        System.out.println("4.4加上7.11的结果："+practice71.add(4.4,7.11));
        System.out.println("8.9减去2.28的结果："+practice71.minus(8.9,2.28));
        System.out.println("5.2乘以13.14的结果："+practice71.multiply(5.2,13.14));
        System.out.println("92除以89的结果：" +practice71.divide(92,89));
    }
}
