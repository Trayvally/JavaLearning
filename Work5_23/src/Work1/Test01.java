package Work1;

import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        Demo<Integer> demo=new Demo<>();
        demo.add(213);
        demo.add(11);
        demo.add(98);
        demo.add(75);
        demo.add(77);
        demo.show();

        System.out.println("查询结果："+demo.queryByT(11));
        demo.delete(11);
        demo.show();
        demo.update(2,66);
        demo.show();






    }


}
