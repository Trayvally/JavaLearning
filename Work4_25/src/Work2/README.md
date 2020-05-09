1. 运行速度         
    或者说是执行速度，在这方面运行速度快慢为：StringBuilder > StringBuffer > String      
       String最慢的原因：String为字符串常量，而StringBuilder和StringBuffer均为字符串变量，
       即String对象一旦创建之后该对象是不可更改的，但后两者的对象是变量，是可以更改的。
2. 线程安全     
　　在线程安全上，StringBuilder是线程不安全的，而StringBuffer是线程安全的。      
    如果一个StringBuffer对象在字符串缓冲区被多个线程使用时，StringBuffer中很多方法可以带有synchronized关键字，
    所以可以保证线程是安全的，但StringBuilder的方法则没有该关键字，所以不能保证线程安全，有可能会出现一些错误的操作。
    所以如果要进行的操作是多线程的，那么就要使用StringBuffer，但是在单线程的情况下，还是建议使用速度比较快的StringBuilder。        
（一个线程访问一个对象中的synchronized(this)同步代码块时，其他试图访问该对象的线程将被阻塞）