import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String mname, double msalary, int year, int mouth, int day) {
        name = mname;
        salary = msalary;
        hireDay = LocalDate.of(year, mouth, day);
    }

    public String getName() {
        return name;
    }


    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double percentage) {
        double raise = salary * percentage / 100;
        salary = salary + raise;
    }

    public String toString (){
        return  getClass().getName()+"[name="+name
                +",salary"+salary
                +"hierDay"+hireDay
                +"]";
    }
    public int hashCode(){
        return Objects.hash(name,salary,hireDay);
    }

    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;

        if (otherObject == null) return false;

        if (getClass() != otherObject.getClass()) return false;

        if (!(otherObject instanceof Employee)) return false;

        Employee other = (Employee) otherObject;

        return name.equals(other.name)
                && salary == other.salary
                && hireDay.equals(other.hireDay);
    }

    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 2);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
        ArrayList<Employee> w = new ArrayList<>();
        w.add(staff[0]);
        w.add(staff[1]);
        w.add(staff[2]);
        for (Employee e : staff
        ) {
            System.out.println("name=" + e.getName()
                    + " salary=" + e.getSalary()
                    + " hireday=" + e.getHireDay());
        }
        System.out.println(w.get(0));
        System.out.println(w.get(1));
        Employee m = w.remove(1);
        System.out.println(m);
        System.out.println(w.get(0));
        System.out.println(w.get(1));
    }
}

