package Work4.Work4_2;

public class Test2 {
    public static void main(String[] args) {
        Array<Integer> ar1=new Array<Integer>(new Integer[]{3,5,1,6,77,90,42});
        Array<Double> ar2=new Array<Double>(new Double[]{3.23,3.24,233.43,4.1,6.7});
        System.out.println("Integer型如下：");
        ar1.getMax();
        ar1.getMin();
        ar1.getAver();
        System.out.println("Double型如下：");
        ar2.getMax();
        ar2.getMin();
        ar2.getAver();

    }
}
