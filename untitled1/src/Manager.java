import java.net.spi.InetAddressResolver;

public class Manager extends Employee {
    private double bonus;

    public Manager(String mname, double msalary, int year, int mouth, int day) {
        super(mname, msalary, year, mouth, day);
        bonus = 0;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;

        var other = (Manager) otherObject;
        return bonus == other.bonus;
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), bonus);
    }

    public String toSting() {
        return super.toString() + "[bonus=" + bonus + "]";
    }


}
