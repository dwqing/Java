class Bird{
    public void fly(){
        System.out.println("鸟都会飞吗？");
    }
}
public class Chicken extends Bird{
    @Override
    public void fly() {
        System.out.println("鸡就不会飞");
    }

    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        if (chicken instanceof Bird){
            System.out.println("鸡属于鸟类");
            Bird bird = new Bird();
            bird.fly();
            chicken.fly();
        }else {
            System.out.println("鸡不属于鸟类");
        }
    }
}
