package Work.Work3_28.Work2_3_28;

public class B extends A {
    static int i = 2;

    public static void main(String[] args) {
        B b = new B();
        b.print();
        //因为static变量只载入一次且最先被加载吗？
    }
}
