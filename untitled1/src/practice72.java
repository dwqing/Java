public class practice72 {
    String name;
    int age;
    public practice72(String name ,int age){
        this.name=name;
        this.age=age;
    }
    public void buyTicket(){
        if (this.age>=18)
            System.out.println(this.name+"\t\t"+this.age+"\t\t"+40);
        else
            System.out.println(this.name+"\t\t"+this.age+"\t\t"+20);
    }

    public static void main(String[] args) {
        System.out.println("姓名\t\t年龄\t\t票价（元）");
        System.out.println("_________________________________");
        practice72 p1=new practice72("李明",20);p1.buyTicket();
        practice72 p2=new practice72("钱丽",16);p2.buyTicket();
        practice72 p3=new practice72("周刚",8);p3.buyTicket();
        practice72 p4=new practice72("吴红",32);p4.buyTicket();

    }
}
