package Work2.Lecture3;

import java.util.TreeSet;


public class Test03 {
    public static void main(String[] args) {
        TreeSet<Person> treeSet=new TreeSet<>();
        treeSet.add(new Person("wangwu",14,99,33));
        treeSet.add(new Person("lisi",16,99,33));
        treeSet.add(new Person("zhaoliu",13,88,25));
        treeSet.add(new Person("tianqi",14,53,18));
        treeSet.add(new Person("zhangsan",18,86,24));

        System.out.println(treeSet);
    }

}
