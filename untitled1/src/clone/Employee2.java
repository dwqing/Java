package clone;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee2 implements Cloneable{
    private String name;
    private double salary;
    private Date hireDay;

    public Employee2(String name, double salary){
        this.name = name;
        this.salary = salary;
        this.hireDay = new Date();
    }
    public Employee2 clone() throws CloneNotSupportedException{
        Employee2 cloned = (Employee2) super.clone();
        cloned.hireDay = (Date) hireDay.clone();
        return cloned;
    }
    public void setHireDay(int year, int mouth, int day){
        Date newHireDay = new GregorianCalendar(year,mouth -1,day).getTime();
        hireDay.setTime(newHireDay.getTime());
    }
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent /100;
        salary = salary + raise;
    }
    public String toString(){
        return "Employee[name" + name +",salary="+salary+",hireDay="+hireDay+"]";
    }
}
