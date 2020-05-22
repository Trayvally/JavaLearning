package CollectionTest.Work3.TEST3;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Fruit> s=new ArrayList<>();
        Fruit   Fruit1=new Fruit("apple");
        Fruit  Fruit2=new Fruit("grape");
        Fruit  Fruit3=new Fruit("banana");
        Fruit  Fruit4=new Fruit("pear");

        s.add(Fruit1);
        s.add(Fruit2);
        s.add(Fruit3);
        s.add(Fruit4);
        System.out.println(s);
        Fruit max= Collections.max(s,new Name());
        System.out.println("max="+max);
        Fruit min =Collections.min(s,new Name());
        System.out.println("min="+min);
        Collections.sort(s,new Name());
        System.out.println(s);
    }

}
