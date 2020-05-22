package CollectionTest.Work1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CllectionDemo {
    public static void main(String[] args) {
        Collection con=new ArrayList();
        Collection con1=new ArrayList();
        int []i=new int[]{1, 23, 66, 78};
        Person person=new Person("张四",23,"火星");
        con1.add(i);
        con.add(15);
        con.add('s');
        con.add("sdsdsafqefq");
        con.add(15.226);
        con.addAll(con1);
        con.add(person);
        System.out.println("con:"+con);
//        con.clear();
//        System.out.println("con:"+con);
        System.out.println(con.contains(15));
        System.out.println(con.containsAll(con1));
        System.out.println(con.equals(con1));
        System.out.println(con.hashCode());
        System.out.println(con.isEmpty());
        System.out.println(con.iterator());
        System.out.println(con.parallelStream());
        con.remove(15);
        System.out.println(con);
        con.removeAll(con1);
        System.out.println(con);
        System.out.println(con.size());

        System.out.println(con.stream().count());
        Object [] obj=con.toArray();
        for (int j = 0; j < obj.length; j++) {
            System.out.println(">>"+obj[j]);
        }

        for (Object obj1: con){
            System.out.println("--"+obj1);
        }
        /**
         * 第三种遍历方式
         */
        Iterator iterator = con.iterator();
        while (iterator.hasNext()) {
            Object obj2=iterator.next();
            System.out.println("##########"+obj2);
        }


        System.out.println(con.retainAll(con1));
        System.out.println(con);

    }
}
