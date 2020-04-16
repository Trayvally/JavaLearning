一、单选择题
1、编译Java Application 源程序文件将产生相应的字节码文件，这些字节码文件的扩展名为(B)。
    A. .java                      B. .class
    C. .html                      D. .exe
2、设 x = 1 , y = 2 , z = 3，则表达式 y＋＝z－－/＋＋x 的值是(A)。
    A. 3                         B. 3. 5
    C. 4                         D. 5
3、不允许作为类及类成员的访问控制符的是(D)。
    A. public                    B. private
    C. static                    D. protected
4、为AB类的一个无形式参数无返回值的方法method书写方法头，使得使用类名AB作为前缀就可以调用它，该方法头的形式为(A)。
    A. static void method( )                    B. public void method( )    
    C. final void method( )                     D. abstract void method( )
5、给定java 代码如下，编译运行后，输出结果是(C)(选择一项）。  
public class test { 
	static int i; 
	public int aMethod() { 
	  i++; 
	  return i; 
} 
	public static void main (String args[]) {    
        Test test=new Test() ;  
        test.aMethod () ; 
	System.out.println (test.aMethod()) ; 
} 
}        
  a) 0    b) 1   c) 2    d) 3      
6．设有定义语句“int a[]={66,88,99};”，则以下对此语句的叙述错误的是（C）
　A．定义了一个名为a的一维数组      B．a数组有3个元素
　C．a数组的元素的下标为1～3    　  D．数组中的每个元素是整数
7．设有定义“int[] a=new int[4];”则数组a的所有元素是（B）
A．a0、a1、a2、a3            B．a[0]、a[1]、a[2]、a[3]    
C．a[1]、a[2]、a[3]、a[4]    D．a[0]、a[1]、a[2]、a[3]、a[4]
8．下面哪个选项正确地声明了一个字符串数组 （A）
A．char[] str     B．char[][] str     C．String[] str      D．String[10] str
9、假设有这样的数组创建：int a[]={1,2,3,4,5,6,7};则该数组长度为 (D)。
A．4   B．5  C．6  D．7
10、下列二维数组的创建中错误的是(D)。
A．int a[][]=new int[3][] ; 
B．int[][] a=new int[3][4] ;
C．int a[][]={{1,2},{3,4}} ;
D．int [][] a=new int[][];
11 方法内定义的变量（B）。
A．一定在方法内所有位置可见     B．可能在方法的局部位置可见
C．在方法外可以使用             D．在方法外可见
12 方法的形参（A）。
A．可以没有            B．至少有一个
C．必须定义多个形参     D．只能是简单变量
13 return语句（D）。
A．不能用来返回对象   B．只可以返回数值
C．方法都必须含有    D．一个方法中可以有多个
14．main()方法的返回值类型是(C)
A．boolean  B．int
C．void     D．static
15．编译并运行下面的程序，运行结果是（A）。
public class A{
   public static void main(String args[]){
      A a=new A();
      a.method(8);
   }
   void method(int i){
      System.out.println(“int:  ”+i);
   }
   void method(long i){
      System.out.println(“long:  ”+i);
   }
A．程序可以编译运行，输出结果为：“int:  8”    
B．程序可以编译运行，输出结果为：“long:  8”    
C．程序有编译错误，因为两个method()方法必须定义为静态（static）的
D．程序可以编译运行，但是没有输出
16．能作为类及其成员的修饰符是（A）。
A．interface     B．class
C．protected     D．public
17．下列方法定义中，方法头不正确的是(A）。
A．public static x(double a){…}   B．public static int x(double y){…}
C．void x(double d){…}            D．public int x(){…}
18．构造方法在（D）时被调用。
A．类定义时          B．使用对象的变量时
C．调用对象方法时     D．创建对象时
19．下列哪个类声明是正确的（A）。
A．public abstract class Car{…} B．abstract private move(){…}
C．protected private number;    D．abstract final class H1{…}
20．下列不属于面向对象程序设计的基本特征的是（D）。
A．抽象     B．封装
C．继承     D．静态
21．请看下面的程序
class Person{
 	String name,department;
	int age;
	public Person(String n){name=n;}
	public Person(String n,int a){name=n; age=a;}
	public Person(String n, String d, int a ){
	//doing the same as two arguments version if constructer
}
下面那个选项可以添加到// doing the same……处（  C ）
A．Person(n,a) B．this(Person(n,a))
C．this(n,a)//调用的是第二个有参构造函数    D．this(name.age)
22．请看下面的程序段
class Test{
   private int m;
   public static void fun(){
   //some code
	}
}
方法fun()如何来访问变量m（  C  ）
A．将private int m 改成protected int m    B．将private int m 改成public int m
C．将private int m 改成static int m       D．将private int m 改成int m  
24.有一个类A，对于其构造函数的声明正确的是（B）。
A．void A(int x){…}  B．public A(int x){…}
C．A A(int x){…}     D．int A(int x){…}
25．请看下面的程序段
public class Test{
  long a[]=new long[10];
  pubic static void main(String args[]){
	System.out.println(a[6]);
}
}
哪一个选项是正确的（  C）。
A．不输出任何内容      	B．输出0
C．当编译时有错误出现    	D．当运行时有错误出现  
26关键字（D）表明一个对象或变量在初始化后不能修改。
A．extends      B．final
C．this     	D．finalize
27．声明为static的方法不能访问（C）类成员。
A．超类         	B．子类
C．非static     	D．用户自定义类
28．定义类A如下：（重要）
class A{
  int a,b,c;
  public void B(int x,int y, int z){ 
	a=x;b=y;c=z;
	}
}
下面对方法B的重载哪个是正确的（B）。
A．public void A(int x1,int y1, int z1){ a=x1;b=y1;c=z1;}
B．public void B(int x1,int y1, int z1){ a=x1;b=y1;c=z1;}
C．public void B(int x,int y){ a=x;b=y;c=0;}     
D．public B(int x,int y, int z){ a=x;b=y;c=z;}
29．编译运行下面的程序，结果是（B）。（重要）
public class A{
  public static void main(String args[]){
		B b=new B();
		b.test();
}
  void test(){
	System.out.print(“A”);
  }
}
class B extends A{
  void test(){
	super.test();
	System.out.print(“B”);
  }
}
A．产生编译错误    			   B．代码可以编译运行，并输出结果：AB
C．代码可以编译运行，但没有输出     D．编译没有错误，但会产生运行时异常
30．已知类关系如下：
Class Employee{}
Class Manager extends Employee{}
Class Director extends Employee{}
则下列语句正确的是：（A）。
A．Employee e=new  Manager();      B．Director d=new  Manager();
C．Director d =new  Employee ();   D．Manager m=new  Director ();
31．接口是Java面向对象的实现机制之一，以下说法正确的是（B）。
A．Java支持多重继承，一个类可以实现多个接口
B．Java只支持单重继承，一个类可以实现多个接口
C．Java只支持单重继承，一个类可以实现一个接口    
D．Java支持多重继承，但一个类只可以实现一个接口
32．下列方法的声明中不合法的是(C)
A．float area( ){…}
B．void area( ){…} 
C．area{…}
D．int area(int r){…}
33、下面哪个包是编程时不需要导入就可以直接使用的(B)
A．java.net
B．java.lang
C．java.sql
D．java.util
34、调用构造方法是在(B)
A．类定义时　　　　　　B．创建对象时
C．调用对象的方法时　　D．使用对象的变量时
35、在子类构造方法的哪个地方可以调用其父类的构造方法(B)
A．任何地方
B．构造方法的第一条语句 
C．构造方法的最后一条语句 
D．无法在子类构造方法中调用父类的构造方法
36、关于Java中的继承，下列说法错误的是(D)
A．继承是面向对象编程的核心特征，通过继承可以更有效地组织程序结构。
B．继承使得程序员可以在原有类的基础上很快设计出一个功能更强的新类，而不必从头开始，避免了工作上的重复。
C．每一次继承时，子类都会自动拥有父类的属性和方法，同时也可以加入自己的一些特性，使得它更具体、功能更强大。
D．继承一般有多重继承和单一继承两种方式，在单一继承中每一个类最多只有一个父类，而多重继承则可以有多个父类。Java中的类都采用多重继承。
37、当方法中的局部变量与成员变量同名时，必须使用下列哪一个关键字指出成员变量(C)
A．static
B．super
C．this
D．new
38、什么样的方法不能被重写(A)
A．私有（private）方法
B．最终（final）方法
C．受保护（protected）的方法
D．以上都不对
39、下列程序运行的结果是(A)
interface InterfaceA{
	String s="good ";
	void f();
}
class ClassA implements InterfaceA{
 public void f(){
	System.out.print(s);
}
}
class ClassB{
void g(InterfaceA a){
a.f();
}
}
public class E {
	public static void main(String[] args) {
		ClassB b=new ClassB();
		b.g(new ClassA());
	}
}
A．good 
B．编译正确，但无运行结果
C．编译错误：b.g(new ClassA())
D．以上都不对
40、下列类的声明中不合法的是(A)
A．class People（）{…}
B．class 植物{…} 
C．class A{…}
D．public class 共有类{…}
41、能作为类的修饰符, 也能作为类成员的修饰符的是(D)
A．public 
B．extends
C．Float
D．static
42、试完成下述程序片段( B)
public class Point{
	int x,y;
	public  Point(int x,int y){
	(   )=x; 
	(   )=y;
  }
      ...... 
}
A．Point.x   Point.y  B．this.x   this.y
C．super.x  super.y   D．无解
43、在JAVA 中，下列说法正确的是：( C)
A．一个子类可以有多个父类，一个父类也可以有多个子类
B．一个子类可以有多个父类，但一个父类只可以有一个子类
C．一个子类只可以有一个父类，但一个父类可以有多个子类
D．上述说法都不对
44、Father和Son是两个java类，下列哪一选项正确的标识出Father是Son的父类( D)  
A．class Son implements Father
B．class Father implements Son
C．class Father extends Son
D．class Son extends Father 
45、重载指的是方法具有相同的名字，但这些方法的参数必须不同。下列哪种说法不属于方法参数的不同(C )
A．形式参数的个数不同。
B．形式参数的类型不同。
C．形式参数的名字不同。
D．形式参数类型的排列顺序不同。
46、下列有关抽象类与接口的叙述中正确的是哪一个（ C）
A．抽象类中必须有抽象方法，接口中也必须有抽象方法
B．抽象类中可以有非抽象方法，接口中也可以有非抽象方法
C．含有抽象方法的类必须是抽象类，接口中的方法必须是抽象方法
D．抽象类中的变量定义时必须初始化，而接口中不是
47、从下列程序中你发现了几处错误(C)
abstract class A{
	abstract void f(){};//
  	public abstract void k();
}
class B extends A{
	protected void f(){    }
	void k(){//
		System.out.print("I am subclass");
}
public static void main(String[] args) {
	A a=new A();//
	a.f();
    a.k();
	}
}
A．1   B．2     C．3      D．4
48、关于接口的定义和实现，以下描述正确的是(A)
A．接口定义的方法只有定义没有实现
B．接口定义中的变量都必须写明final和static
C．如果一个接口由多个类来实现，则这些类在实现该接口中的方法时采用统一的代码
D．如果一个类实现接口，则必须实现该接口中的所有方法，但方法未必申明为public
49.char类型的整数范围是（A）
A. 0 ... 32767 
B. 0 ... 65535 
C. –256 ... 255 
D. –32768 ... 32767 
50.以下程序正确的输出是（A）
public class FatherClass {
	public FatherClass() {
		System.out.println("FatherClass Create");
    }
}
public class ChildClass extends FatherClass {
    public ChildClass() {
       System.out.println("ChildClass Create");
	}
    public static void main(String[] args) {
       FatherClass fc = new FatherClass();
       ChildClass cc = new ChildClass();
   	}
}
先调用父类在调用本类
A.FatherClass Create
     FatherClass Create
     ChildClass Create
 
B.FatherClass Create
      ChildClass Create
      FatherClass Create
 
C.ChildClass Create
     ChildClass Create
     FatherClass Create
 
D.ChildClass Create
      FatherClass Create
      FatherClass Create
二、填空题
1．如果一个方法不返回任何值，则该方法的返回值类型为( void)。
2．如果子类中的某个方法名、返回值类型和(  参数列表)与父类中的某个方法完全一致，则称子类中的这个方法覆盖了父类的同名方法。
3．接口中所有的属性均为(  )、(  )和(  )的
4．( 接口)方法是一种仅有方法声明，没有具体方法体和操作实现的方法，该方法必须在( 子 )类之中定义。
5．在Java程序中，通过类的定义只能实现( 单)继承，但通过( 接口 )的定义可以实现多重继承关系。
三、简答题
1、什么是继承？
    继承是面向对象软件技术当中的一个概念，与多态、封装共为面向对象的三个基本特征。继承可以使得子类具有父类的属性和方法或者重新定义、追加属性和方法等。
2、请简述重载和重写的区别？
    1. 重载：
    
    必须就有不同的参数列表；
    可以有不同的返回类型；
    可以有不同的访问修饰符；
    可以抛出不同的异常；
    
    2.重写：
    
    参数列表必须与被重写的方法的相同；
    返回的类型必须与被重写的方法的相同；
    访问修饰符的限定必须大于被重写的方法的访问修饰符（public>protected>default>private）；
    重写方法一定不能抛出新的检查异常或者重写的方法申明更加宽泛的检查异常；
3.抽象类和接口的区别
    成员区别：
    抽象类 可以有成员变量，常量，有抽象方法，也可以有非抽象方法
    接口   只有抽象方法（JDK1.8之前）和常量
    
    抽象类只能单继承，接口可以多继承
    
4.分别解释一下this,super,final,static 关键字 越详细越好
    一、final 关键字
    　　final关键字主要用在三个地方：变量、方法、类。
    　　1、对于一个final变量，如果是基本数据类型的变量，则其数值一旦在初始化之后便不能更改；如果是引用类型的变量，
        则在对其初始化之后便不能再让其指向另一个对象。  
    
    　　2、当用final修饰一个类时，表明这个类不能被继承。final类中的所有成员方法都会被隐式地指定为final方法。  
    
    　　3、使用final方法的原因有两个。第一个原因是把方法锁定，以防任何继承类修改它的含义；第二个原因是效率。
        在早期的Java实现版本中，会将final方法转为内嵌调用。但是如果方法过于庞大，可能看不到内嵌调用带来的任何
        性能提升（现在的Java版本已经不需要使用final方法进行这些优化了）。类中所有的private方法都隐式地指定为final。
    
    二、static 关键字
    　　static 关键字主要有以下四种使用场景：
    　　1、修饰成员变量和成员方法
    　　修饰成员变量和成员方法: 被 static 修饰的成员属于类，不属于单个这个类的某个对象，被类中所有对象共享，可以并且建
        议通过类名调用。被static 声明的成员变量属于静态成员变量，静态变量 存放在 Java 内存区域的方法区。
        调用格式：类名.静态变量名 类名.静态方法名()
        2、静态代码块
        　　静态代码块: 静态代码块定义在类中方法外, 静态代码块在非静态代码块之前执行(静态代码块—>非静态代码块—>构造方法)。 
        该类不管创建多少对象，静态代码块只执行一次.
        　静态代码块对于定义在它之后的静态变量，可以赋值，但是不能访问。
        3、静态内部类
        　　静态内部类（static修饰类的话只能修饰内部类）：
        
        　　静态内部类与非静态内部类之间存在一个最大的区别，我们知道非静态内部类在编译完成之后会隐含地保存着一个引用，
        该引用是指向创建它的外围类，但是静态内部类却没有。没有这个引用就意味着：  
        　　1、它的创建是不需要依赖外围类的创建。        
        　　2、它不能使用任何外围类的非static成员变量和方法。
        静态方法与非静态方法
        　　静态方法属于类本身，非静态方法属于从该类生成的每个对象。 如果您的方法执行的操作不依赖于其类的各个变量和方法，
        请将其设置为静态（这将使程序的占用空间更小）。 否则，它应该是非静态的。
        
    三、this 关键字
       　　this关键字用于引用类的当前实例。
       
    四、super 关键字
    　　super关键字用于从子类访问父类的变量和方法。
5.什么是类？什么是对象？类和对象有何联系？
    类的概念 ： 类是具有相同属性和服务的一组对象的集合。为属于该类的所有对象提供了统一的抽象描述，其内部包括属性和服务两个主要部分zd。
在面向对象的编程语言中，类是一个独立的程序单位，应该有一个类名并包括属性说明和服务说明两个主要部分。
    对象的概念：对象是系统中用来描述客版观事物的一个实体，是构成系统的一个基本单位。一个对象由一组属性和对这组属性进行操作的一组服务组成。
从更抽象的角度来说，对象是问题域或实现域中某些事物的一个抽象，它反映该事物在系统中需要保存的信息和发挥的作用；它是一组属性和有权对
这些属性进行操作的一组服务的封装体。客观世界是由对象和对象之间的联系组成的。
    类与对象的关系就如模具和铸件的关系，类的实例化结果就是对象，而权对一类对象的抽象就是类。类描述了一组有相同特性( 属性 ) 和相同行为 ( 方法 ) 的对象。
6.方法的重载和方法的覆盖有什么不同？
    1、子类与父类的关系不同：覆盖方法中的子类与父类之间是垂直关系；在重载方法中因为两个方法在同一个类中，所以是不同方法之间的水平关系。
    
    2、映射关系不同：覆盖只能由一个方法，或只能由一对方法产生关系；在重载方法时，多个方法之间发生变化。
    
    3、对于参数列表的需求不同：覆盖要求参数列表相同；重载要求参数列表不同。
7.类变量和实例变量有何区别？
    类变量是所有对象共有,其中一个对象将它值改变,其他对象得到的就是改变后的结果;
    而实例变量则属对象私有,某一个对象将其值改变,不影响其他对象;
8.Java的成员变量修饰符有哪几种？(写出吴中)其中哪种修饰符限定的范围最大？
    public（公共访问控制符），指定该变量为公共的，他可以被任何对象的方法访问；
    private（私有访问控制符）指定该变量只允许自己的类的百方法访问，其他任何类（包括子类）中的方法均不能访问；
    protected（保护访问控制符）指定该变量可以别被自己的类和子类访问。在子类中可以覆盖此变量；
    final，最终修饰符，指定此变量的值不能变；
    static（静态修饰符）指定变量被所有对象共享，即所有实例都可以使用该变量。变量属于这内个类；
    
    其中public限定范围最大
9.说明对象的基本概念和主要特征？
对象就是真实世界中的实体，对象与实体是一一对应的，也就是说现实世界中每一个实体都是一个对象，它是一种具体的概念。
对象的主要特征
对象的行为(behavior)----可以对对象施加哪些操作，或可以对对象施加哪些方法?
对象的状态(state)----当施加那些方法时对象如何响应?，
对象标识(identity)----如何辨别具有相同行为与状态的不同对象?

面向对象具有继承、封装和多态 3 个核心特性。