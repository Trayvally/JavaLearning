1. 捕获异常try...catch...finally
   
   捕获异常：Java中对异常有针对性的语句进行捕获，可以对出现的异常进行指定方式的处理
   
    语句格式：
   
````
   try {
   
        //需要被检测的语句。
   
   }
   
   catch(异常类 变量) { //参数。
   
        //异常的处理语句。
   
   }
   
   finally {
   
        //一定会被执行的语句。
   
   }
````

2. 自定义类异常

格式：

``
Class 异常名 extends Exception{ //或继承RuntimeException
    public 异常名(){
}
    public 异常名(String s){ 
super(s); 
}
}
``

自定义异常继承Exception演示：

``
class MyException extends Exception{
    /*
    为什么要定义构造函数，因为看到Java中的异常描述类中有提供对异常对象的初始化方法。
    */
    public MyException(){
        super();
    }
    public MyException(String message)    {
        super(message);// 如果自定义异常需要异常信息，可以通过调用父类的带有字符串参数的构造函数即可。
    }
}
``