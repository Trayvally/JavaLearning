package CollectionTest.Work3.TEST3;

import java.util.Comparator;

public class Name implements Comparator<Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2) {

        return o2.getName().compareTo(o1.getName());
    }
}
