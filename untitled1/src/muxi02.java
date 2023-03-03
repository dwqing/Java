public class muxi02 {
    String name;
    int age;

    public muxi02(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("名字：" + this.name);
        System.out.println("年龄" + this.age);
    }

    public static void main(String[] args) {
        muxi02 p1 = new muxi02("张三", 2);
        muxi02 p2 = new muxi02("李四", 34);
        p1.display();
        p2.display();
    }

}
