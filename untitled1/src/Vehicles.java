public class Vehicles {
    private String brand;
    private String color;

    public Vehicles(String brand, String color) {
        this.color = color;
        this.brand = brand;
    }

    public void run() {
        System.out.println("我已经开动了");
    }

    public void showInfo() {
        System.out.println("brand为" + brand + "\n"+
                "color为" + color + "\n");
    }
}
