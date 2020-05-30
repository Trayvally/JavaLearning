package Work1;

public  interface Interface01<T> {
    //
    void   add(T  t);

    //删除
    boolean  delete(T  t);

    //查询
    T    queryByT(T   t);

    //修改
    T  update (Integer j,T  t);

}
