package API.Work1;

import java.util.Scanner;
import java.util.Random;

public class RandomDIY {
    public static void main(String[] args) {
            Scanner ceil=new Scanner(System.in);
            Scanner floor=new Scanner(System.in);
            System.out.println("请输入上界");
            int i=ceil.nextInt();
            System.out.println("请输入下界");
            int j=floor.nextInt();
            double dou=Math.random();
            if (i>j){
                double num=(double) (Math.random()*10000000%(i-j)+1);
                System.out.println(num);
            }else{
                System.out.println("范围输入错误");
            }
    }
}
