package Work.Work3_28.Work1_3_28;

public class Cuboid extends Rectangle {
    private float length;
    private float width;
    private float height;

    public float getVlume(float length,float height,float width){
        return length*height*width;
    }

    public Cuboid(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Cuboid() {
    }

//    @Override
//    public float getLength() {
//        return length;
//    }
//
//    @Override
//    public void setLength(float length) {
//        this.length = length;
//    }
//
//    @Override
//    public float getWidth() {
//        return width;
//    }
//
//    @Override
//    public void setWidth(float width) {
//        this.width = width;
//    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
