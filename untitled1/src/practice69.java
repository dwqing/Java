public class practice69 {
    String name;
    public practice69(String name){
        this.name=name;
    }
    public void catchMice()
    {
        System.out.println(name+"去抓老鼠了");
    }

    public static void main(String[] args) {
        practice69 p1 = new  practice69("白猫");
        p1.catchMice();
        practice69 p2 = new practice69("黑猫");
        p2.catchMice();
        practice69 p3 = new practice69("黄猫");
        p3.catchMice();
    }
}
