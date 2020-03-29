package Work.Work3_28.Work6_3_28;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.setWeight(2);
        vehicle.setWheels(4);

        Truck truck=new Truck();
        truck.setPayload(1000);
        truck.setLoader(8);
        truck.setWheels(4);
        truck.setWeight(3);
        System.out.println(truck.getPayload()+truck.getWheels());
    }
}
