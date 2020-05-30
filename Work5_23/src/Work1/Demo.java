package Work1;

import java.util.ArrayList;
import java.util.List;

public class Demo<T> implements Interface01<T> {
    List<T> list=new ArrayList<>();

    public List<T> getList() {
        return list;
    }

    public void show(){
        for (T i:list){
            System.out.println(i);
        }
        System.out.println("**************");
    }

    @Override
    public void add(T t) {
        list.add(t);
    }

    @Override
    public boolean delete(T t) {
        list.remove(t);
        return false;
    }

    @Override
    public T queryByT(T t) {
        if (list.contains(t)){
            return t;
        }
        return null;
    }

    @Override
    public T update(Integer j,T t) {
        list.set(j,t);
        return t;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "list=" + list +
                '}';
    }


}
