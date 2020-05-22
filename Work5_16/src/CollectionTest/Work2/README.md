 2. 自己是尝试 Collection接口里面的con.retainAll()方法
 
 1、 boolean retainAll(Collection<?> c)  
 仅保留此 collection 中那些也包含在指定 collection 的元素（可选操作）。换句话说，移除此 collection 中未包含在指定 collection 中的所有元素。
 
 2、 list.retainAll(list2):1）如果集合list=list2即两个集合元素完全一样 返回值为false；2）list包含于list2中  返回值为false；3）其他 返回值为true。

 3、 实际上该方法是指：如果集合list中的元素都在集合list2中则list中的元素不做移除操作，反之如果只要有一个不在list2中则会进行移除操作。即：list进行移除操作返回值为：true反之返回值则为false。