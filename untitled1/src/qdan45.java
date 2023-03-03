import java.util.*;

public class qdan45 {
    private static int nextId;

    private int id;
    private String name = "";
    private double salary;

    static {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    {
        id = nextId;
        nextId++;
    }

    public qdan45(String aname, double asalary) {
        name = aname;
        salary = asalary;
    }

    public qdan45(double s) {
        this("qdan45#" + nextId, s);
    }

    public qdan45() {
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        var staff = new qdan45[3];
        staff[0] = new qdan45("Harry", 40000);
        staff[1] = new qdan45(60000);
        staff[2] = new qdan45();
        for (qdan45 e : staff
        ) {
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
        }
    }

}
