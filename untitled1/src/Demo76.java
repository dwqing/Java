class Animal{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Eagle extends Animal{
    public void eat(){
        System.out.println("吃青蛙");
    }
}
class Frog extends Animal{
    public void eat(){
        System.out.println("吃蝗虫");
    }
}
class Grasshopper extends Animal{
    public void eat(){
        System.out.println("吃庄稼");
    }
}
public class Demo76 {
    public static void main(String[] args) {
        Animal animal1 = new Eagle();
        animal1.setName("鹰");
        System.out.println(animal1.getName());
        ((Eagle)animal1).eat();

        Animal animal2 = new Frog();
        animal2.setName("青蛙");
        System.out.println(animal2.getName());
        ((Frog)animal2).eat();

        Animal animal3 =new Grasshopper();
        animal3.setName("蝗虫");
        System.out.println(animal3.getName());
        ((Grasshopper)animal3).eat();
    }
}
