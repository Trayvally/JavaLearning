package Work1.Work1_8;

public class Test {

    public static void main(String[] args) {
        String a="我是你的谁,我是你的剑";

        System.out.println(a.indexOf('你'));
        System.out.println(a.lastIndexOf('你'));
        System.out.println(a.indexOf('你',4));
        String result=a.substring(3);
        System.out.println(result);
        System.out.println(a.replace("谁","被子"));
        System.out.println(a.replace('你','哈'));


        String b=" 我是你的谁,我是你的剑 ";
        System.out.println(b.trim());
        String c="avabc";
        String d="avab";
        System.out.println(c.equals(d));
        byte [] e={68,73,99,77,101};
        String str=new String(e);
        System.out.println(str);




    }
}
