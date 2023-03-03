public class text101 {
    public static void main(String[] args) {
        var v = new Vehicles("奥迪","black");
        var myCar = new  Car("劳斯莱斯","golden",8);
        var recentTruck = new Truck("擎天柱","green",5);

        v.showInfo();

        myCar.showCar();

        recentTruck.showTruck();
    }
}
