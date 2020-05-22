5. 自己尝试写出 Stack 集合特性,并且以代码举例示范
    分析  Collection   List 接口 和
    ArrayList  Vector Stack(三个子实现类和其两个父接口的特点)   
    
· 栈(Stack):数据结构的一种,存储特点:Last In First Out.即先进后出。  
Stack是Vector的子类，比Vector多了几个方法，它的后进先出的特征，就是通过调用这几个方法实现的。

##### Collection接口
1. List接口：存储有序的，可重复的元素  
    实现类：ArrayList(主要的实现类)、LinkedList、Vector  
    1). ArrayList  
         ArrayList 是 List 接口的典型实现类  
         本质上，ArrayList是对象引用的一个变长数组  
         ArrayList 是线程不安全的，而 Vector 是线程安全的，即使为保证 List 集合线程安全，也不推荐使用Vector   
         Arrays.asList(…) 方法返回的 List 集合既不是 ArrayList 实例，也不是 Vector 实例。 Arrays.asList(…) 返回值是一个固定长度的 List 集合  
          
    2). Vector  
         Vector 是一个古老的集合，JDK1.0就有了。大多数操作与ArrayList相同，区别之处在于Vector是线程安全的。    
         在各种list中，最好把ArrayList作为缺省选择。当插入、删除频繁时，使用LinkedList；Vector总是比ArrayList慢，所以尽量避免使用。   
        
    3). Stark   
    Stark 是矢量的一个子类，它实现了一个标准的后进先出的栈。     
    至少被包括矢量定义的所有方法，也定义了自己的一些方法。