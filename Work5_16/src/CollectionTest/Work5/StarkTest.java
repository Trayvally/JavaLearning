package CollectionTest.Work5;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class StarkTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("张三");
        stack.push("李四");
        stack.push("王五");

        Enumeration<String> it = stack.elements();
        while(it.hasMoreElements()){
            String m = it.nextElement();
            System.out.println(m);
        }

        System.out.println("=============");
        Iterator<String> iter = stack.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("=============");
        System.out.println(stack.empty());//判断堆栈是否为空

        System.out.println("=============");
        System.out.println(stack.peek());//查看堆栈顶部的对象，不移除

        System.out.println("=============");
        System.out.println(stack.search("王五"));//返回对象在堆中的位置,栈顶是1,从1开始往下排

        System.out.println("=============");
        System.out.println(stack.pop());//移除堆栈顶部的对象，并将该对象作为返回值
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
