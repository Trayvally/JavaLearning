package Work.Work3_28.Work6_3_28;

public class Car extends Vehicle {
    private int loader;

    public Car() {
    }

    public Car(int loader) {
        this.loader = loader;
    }

    public Car(int wheels, int weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
    }

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }

    @Override
    public String toString() {
        return "Car{" +
                "loader=" + loader +
                '}';
    }
}
