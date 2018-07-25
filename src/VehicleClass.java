public class VehicleClass {

    private int speed;
    private String color;


    public VehicleClass() {
        System.out.println("A new vehicle is created...");
    }

    public String start() {
        return "The " + color + " car is starting...";
    }

    public String accelerate() {
        return "The " + color +" car is accelerating at " + speed + " mph...";
    }

    public String stop() {
        return "The " + color + "  is stopping...";
    }
// getter and setter
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}