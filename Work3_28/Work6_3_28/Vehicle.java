package Work.Work3_28.Work6_3_28;

public class Vehicle {
    private int wheels;
    private int weight;

    public Vehicle() {
    }

    public Vehicle(int wheels, int weight) {
        this.wheels = wheels;
        this.weight = weight;
    }

    public int getWheels() {
        return wheels;
    }

    public int getWeight() {
        return weight;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                ", weight=" + weight +
                '}';
    }
}
