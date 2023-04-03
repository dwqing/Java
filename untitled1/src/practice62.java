public class practice62 {
    public static void main(String[] args) {
        int a[] ={1,3,5,7};
        int tem;
        tem=a[0];
        a[0]=a[2];
        a[2]=tem;
        tem=a[1];
        a[1]=a[3];
        a[3]=tem;
        for (int x:a) {
            System.out.println(x);
        }
    }
}
