public class practiced76 {
    private double width;
    private double length;
    public practiced76(double width,double length){
        this.length=length;
        this.width=width;
    }
    public double square (){
        return width*length;
    }

    public static void main(String[] args) {
        practiced76 u =new practiced76(3.5,4.5);
        System.out.println(u.square());

    }
}
