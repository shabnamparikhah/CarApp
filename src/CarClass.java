public class CarClass extends VehicleClass {
    private String make;
    private String model;
    private int year;


    public CarClass() {
        super();

        System.out.println("A new car has been created...");
    }



    @Override
    public String start() {
        return "The car " + super.getColor() + " is starting...";
    }

    @Override
    public String accelerate() {
        return "The car is accelerating at " + super.getSpeed() + " mph ...";
    }

    @Override
    public String stop() {
        return "The car " + super.getColor() + " is stopping...";
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}