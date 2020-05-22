package CollectionTest.Work4;

import java.util.Comparator;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Vector vector=new Vector();

        vector.add("34");
        vector.add("4");
        vector.add("134");
        vector.add("54");
        vector.add("14");
        vector.add("20");

        vector.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).compareTo((String)o2);
            }
        });

        System.out.println(vector.toString());
    }
}
