package Work3;

public abstract class Person {

    public  abstract void show();
}

class PersonDemo{
    public  void  method(Person person){
        person.show();
    }
}

class Test{
    public static void main(String[] args) {
        PersonDemo  p=new PersonDemo();
        p.method(new Person() {
            @Override
            public void show() {
                System.out.println("我是你的爸爸");
            }
        });
    }
}
