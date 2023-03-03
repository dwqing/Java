class Telephone{
    String button = "button:0~9";
    void call(){
        System.out.println("开始拨打电话");
    }
}
class Mobile extends Telephone{
    String screen = "screen:液晶显示器";
}
public class Demo2 {
    public static void main(String[] args) {
        var motto = new Mobile();
        System.out.println(motto.button);
        System.out.println(motto.screen);
        motto.call();
    }
}
