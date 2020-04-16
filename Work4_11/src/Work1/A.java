package Work1;

abstract class A{
    abstract void f();

    ;
    public abstract void k();
}
class B extends A{
    protected void f(){    }
    public void k(){
        System.out.print("I am subclass");
    }
    public static void main(String[] args) {
        A a= new A() {
            @Override
            void f() {

            }

            @Override
            public void k() {

            }
        };
        a.f();
        a.k();
    }
}
