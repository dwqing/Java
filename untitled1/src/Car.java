public class Car extends Vehicles {

    private int seats;

    public Car(String brand, String color) {
        super(brand, color);
    }

    public Car(String brand , String color,int seats){

        super(brand, color);
        this.seats = seats;

    }

    public void showCar() {
        super.showInfo();
        System.out.println("seats=" + seats);
    }

    public static void main(String[] args) {
        Car a = new Car("aodi", "green",8);
    }
}
