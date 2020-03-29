package Work.Work3_28.Work6_3_28;

public class Truck extends Car {
    private int payload;

    public Truck(int loader) {
        super(loader);
    }

    public Truck() {
    }

    public Truck(int loader, int payload) {
        super(loader);
        this.payload = payload;
    }

    public Truck(int wheels, int weight, int loader, int payload) {
        super(wheels, weight, loader);
        this.payload = payload;
    }

    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "payload=" + payload +
                '}';
    }
}
