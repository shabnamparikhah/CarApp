public class RunClass {
    public static void main(String[] args) {

        VehicleClass vehicle = new VehicleClass();
        vehicle.setColor("Red");
        output(vehicle.start());
        vehicle.setSpeed(20);

        output(vehicle.accelerate());
        output(vehicle.stop());

        CarClass car1 = new CarClass();
        car1.setColor("Blue");
        car1.setMake("Volvo");
        car1.setModel("----");
        car1.setYear(2018);


        output(car1.start());


        car1.setSpeed(89);
        output(car1.accelerate());

        output(car1.stop());
    }
    public static void output(String message) {
        System.out.println(message);

    }
}
