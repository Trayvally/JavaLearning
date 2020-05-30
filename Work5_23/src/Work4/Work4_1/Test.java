package Work4.Work4_1;

import java.util.HashMap;

/**
 *
 *
 */

public class Test {
    public static void main(String[] args) {
        Dao<User> dao = new Dao<User>();//创建一个泛型对象，泛型为User
        /**
         * 对map进行实例化，任何对象在使用的时候都要进行初始化，前面我们
         * 没有给map赋值，这里不初始化直接使用会报空指针异常
         */
        dao.map = new HashMap<String, User>();
        dao.save("a", new User(1, "张三"));
        dao.save("b", new User(2, "李四"));
        dao.save("c", new User(3, "王五"));
        dao.save("d", new User(4, "赵六"));
        dao.save("e", new User(5, "田七"));

        System.out.println(dao.map);
        System.out.println("=================");

        dao.delete("c");
        System.out.println(dao.map);
        System.out.println("=================");

        System.out.println(dao.get("b"));

        dao.update("b",new User(7,"王八"));
        System.out.println(dao.get("b"));
        dao.delete("a");
        dao.list();
    }
}
