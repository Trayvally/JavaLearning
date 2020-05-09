package Work2;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        String str="abc";
        System.out.println(str);
        str=str+"de";
        System.out.println(str);
        /*
        运行这段代码会发现先输出“abc”，然后又输出“abcde”，好像是str这个对象被更改了，
        其实，这只是一种假象罢了，JVM对于这几行代码是这样处理的，首先创建一个String
        对象str，并把“abc”赋值给str，然后在第三行中，其实JVM又创建了一个新的对象也
        名为str，然后再把原来的str的值和“de”加起来再赋值给新的str，而原来的str就会
        被JVM的垃圾回收机制（GC）给回收掉了，所以，str实际上并没有被更改，也就是前面
        说的String对象一旦创建之后就不可更改了。所以，Java中对String对象进行的操作实
        际上是一个不断创建新的对象并且将旧的对象回收的一个过程，所以执行速度很慢。


         */
        /*
        而StringBuilder和StringBuffer的对象是变量，对变量进行操作就是直接对该对象进行更改，
        而不进行创建和回收的操作，所以速度要比String快很多。
         */
        String str1="abc"+"de";
        StringBuilder stringBuilder=new StringBuilder().append("abc").append("de");
        System.out.println(str1);
        System.out.println(stringBuilder.toString());

        long a=new Date().getTime();
        String cc="";
        int n=10000;
        for (int i = 0; i < n; i++) {
            cc+="."+i;
        }
        System.out.println("String使用的时间"+(System.currentTimeMillis()-a)/1000.0+"s");
        long s1=System.currentTimeMillis();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("."+i);
        }
        System.out.println("StringBuilder使用的时间"+(System.currentTimeMillis()-s1)/1000.0+"s");
        long s2=System.currentTimeMillis();
        StringBuffer sbf=new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbf.append("."+i);
        }
        System.out.println("StringBuffer使用的时间"+(System.currentTimeMillis()-s2)/1000.0+"s");
    }
}
