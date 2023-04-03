package timer;
class Car{
    public  int pedalAuto = 2;
    public  int pedalHand = 3;

    public  void  stepOnGas(){
        System.out.println("油门踏板");
    }
    public void stepOnBrake(){
        System.out.println("刹车踏板");
    }
}
class AutoCar extends Car{
    @Override
    public void stepOnGas() {
        System.out.println("右脚踩油门踏板");
    }

    @Override
    public void stepOnBrake() {
        System.out.println("右脚踩刹车踏板"
        );
    }
}
class HandCar extends Car{
    @Override
    public void stepOnGas() {
        System.out.println("右脚踩油门踏板");
    }

    @Override
    public void stepOnBrake() {
        System.out.println("右脚踩刹车踏板"
        );
    }
    public void stepOnClutch(){
        System.out.println("左脚踩离合踏板");
    }

}
public class Demo3 {
    public static void main(String[] args) {
        AutoCar autoCar =new AutoCar();
        System.out.println("自动挡汽车有"+autoCar.pedalAuto+"块踏板");
        autoCar.stepOnGas();
        autoCar.stepOnBrake();
    }
}
