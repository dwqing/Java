class Apple {
    String color;
    String name;
    double wight;
    double price;

    public Apple(String color, String name, double wight, double price) {
        this.color = color;
        this.name = name;
        this.wight = wight;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.color + "的苹果被称为“" + name + "”，每500克" + price + "元RMB， 买了" +wight+ "可，需要支付"
                + price*(wight/500)+"元";
    }
}

public class HongxinFSApple {
    public static void main(String[] args) {
        Apple apple = new Apple("红色","唐欣富士",4.98,2500);
        System.out.println(apple.toString());
    }

}


