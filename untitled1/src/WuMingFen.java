public class WuMingFen {
    String theMa;
    int quantity;
    boolean likeSoup;

    public WuMingFen(String theMa, int quantity, boolean likeSoup) {
        this.theMa = theMa;
        this.quantity = quantity;
        this.likeSoup = likeSoup;
    }

    public WuMingFen(String theMa, int quantity) {
        this.theMa = theMa;
        this.quantity = quantity;
    }

    public WuMingFen() {
        theMa = "酸辣";
        quantity = 2;
        likeSoup = true;
    }

    public void check() {
        System.out.println("是" + theMa + "面码，有" + quantity + "两重量" + "是否带汤" + likeSoup);
    }

    public static void main(String[] args) {
        WuMingFen f1 = new WuMingFen("牛肉", 3, true);
        WuMingFen f2 = new WuMingFen("牛肉", 2);
        WuMingFen f3 = new WuMingFen();
        f1.check();
        f2.check();
        f3.check();
    }
}
