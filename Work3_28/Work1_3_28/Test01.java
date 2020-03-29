package Work.Work3_28.Work1_3_28;

public class Test01 {
    public static void main(String[] args) {
        Rectangle rec=new Rectangle();
        rec.setLength(10);
        rec.setWidth(5);
        System.out.println("面积为："+rec.getArea(10,5));

        Cuboid cuboid=new Cuboid();

        cuboid.setLength(4);
        cuboid.setHeight(5);
        cuboid.setWidth(3);
        System.out.println("底面积为："+cuboid.getArea(4,3));
        System.out.println("体积为："+cuboid.getVlume(4,5,3));

    }
}
