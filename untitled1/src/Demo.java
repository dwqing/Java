class Parent{
    public Parent(){
        System.out.println("调用父类构造器");
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("调用子类构造器");
    }
}
public class Demo {
    public static void main(String[] args) {
        new Child();
    }
}
