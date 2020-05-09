package Work1.Work1_2;

public class Test {
    public static void main(String[] args) {
        Demo b=new Demo();
        byte []  by={'z','s','c','c','b'};
        b.setBy(by);
        String str=new String(b.getBy());
        System.out.println(str);
    }
}
