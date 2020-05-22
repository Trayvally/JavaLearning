package CollectionTest.Work3.TEST5;

import java.util.HashSet;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一行字符串:");
        //创建HashSet对象,将字符存储,去掉重复
        HashSet<Character> hs = new HashSet<>();
        //将字符串转换为字符数组,获取每一个字符存储在HashSet集合中,自动去除重复
        String line = sc.nextLine();
        char[] arr = line.toCharArray();

        for (char c : arr) {							//遍历字符数组
            hs.add(c);
        }
        //遍历HashSet,打印每一个字符
        for(Character ch : hs) {
            System.out.print(ch);
        }
    }
}
