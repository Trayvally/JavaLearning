package ExceptionTest.Work3;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int n=0;
        int []array={};
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你要计算的数的个数:");
        do {
            n=scanner.nextInt();
            try {
                if (n<0){
                    throw new NegativeNumberException("N必须是正数或者0");
                }
                else {
                    break;
                }
            }catch (NegativeNumberException e){
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println("请再次输入数的个数：");
            }

        }while (true);
        int []arr=new int[n];
        for (int i=0;i<arr.length;i++){
            System.out.println("请输入第"+(i+1)+"个数字");
            arr[i]=scanner.nextInt();
        }
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("平均数为:"+sum/arr.length);

    }

}
