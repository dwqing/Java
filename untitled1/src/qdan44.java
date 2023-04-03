public class qdan44 {
    private String name;
    private double salary;

    public qdan44(String name, double s) {
        this.name = name;
        this.salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary = salary + raise;
    }

    public static void tripleValue(double x) {
        x = x * 3;
        System.out.println("End of method:x =" + x);
    }

    public static void tripeSalary(qdan44 x) {
        x.raiseSalary(200);
        System.out.println("End of method:salary=" + x.getSalary());
    }

    public static void swap(qdan44 x, qdan44 y) {
        qdan44 temp = x;
        x = y;
        y = temp;
        System.out.println("End of method:x=" + x.getName());
        System.out.println("End of method:y=" + y.getName());
    }

    public static void main(String[] args) {
        System.out.println("Testing tripeValue:");
        double percent = 10;
        System.out.println("Before:percent=" + percent);
        tripleValue(percent);
        System.out.println("After:percent=" + percent);
        System.out.println("\nTesting tripleSalary:");
        qdan44 harry = new qdan44("Harry", 50000);
        System.out.println("Before:salary=" + harry.getSalary());
        tripeSalary(harry);
        System.out.println("After:salary=" + harry.getSalary());
        System.out.println("\nTexting swap");
        qdan44 a = new qdan44("Alice", 70000);
        qdan44 b = new qdan44("Bob", 60000);
        System.out.println("Before:a=" + a.getName());
        System.out.println("Before:b=" + b.getName());
        swap(a, b);
        System.out.println("After:a=" + a.getName());
        System.out.println("After:b=" + b.getName());
    }
}