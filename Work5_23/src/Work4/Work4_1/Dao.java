package Work4.Work4_1;

import java.util.*;

public class Dao<T> {
    Map<String,T> map;//map具有键的类型，值的类型

    public Dao() {
    }

    public Dao(Map<String, T> map) {
        this.map = map;
    }

    public Map<String, T> getMap() {
        return map;
    }

    public void setMap(Map<String, T> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Dao{" +
                "map=" + map +
                '}';
    }

    public void save(String id,T entity){
        map.put(id,entity);
    } //保存T乐行的对象到map集合中

    public T get(String id){
        return map.get(id);
    } //从map中获取id对应的对象
    public  void update(String id,T entity){

        map.replace(id,entity);
    } //替换map中的key为id的内容
    public List<T> list() {
        List<T> list=new ArrayList<>();//创建一个list集合对象
        Set<String> set=map.keySet();
        //通过Map里面的keySet()方法来获取键值，其返回值为Set，因此要创建一个Set对象接收
        Iterator<String> it=set.iterator();//创建迭代器对象传入set
        while (it.hasNext()){//迭代
            String key = it.next();//将每次迭代的key保存下来
            System.out.println(map.get(key));//通过Map里面的get(key)方法来获取对应的值
        }
        return list;//返回list集合
    } //返回map中所有的 T 对象
    public  void delete(String id){

        this.map.remove(id);
    } //删除指定对象


}
