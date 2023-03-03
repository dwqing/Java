public class practice73 {
    String name;
    double chinese;
    double math;
    double english;
    int time=1;
    public practice73(String name,double chinese,double math,double english){
        this.chinese=chinese;
        this.name=name;
        this.math=math;
        this.english=english;
    }
    public void output(){
        double average=(this.chinese+this.math+this.english)/3;
        System.out.println(time+"\t\t"+name+"\t\t"+chinese+"\t\t"+math+"\t\t"+english+"\t\t"+average);
        time++;
    }

    public static void main(String[] args) {
        System.out.println("学号\t\t姓名\t\t语文\t\t数学\t\t英语\t\t平均分");
        System.out.println("________________________________________________________________");
        practice73 p1=new practice73("张三",91.5,98.0,89.0);p1.output();
        practice73 p2=new practice73("李四",96.0,98.5,93.0);p2.output();
        practice73 p3=new practice73("王五",97.0,100.0,98.5);p3.output();
        practice73 p4=new practice73("钱六",77.0,83.0,81.0);p4.output();
    }
}
