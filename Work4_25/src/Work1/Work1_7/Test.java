package Work1.Work1_7;

public class Test {

    public Test() {
    }

    public String findString(String string, String find){
        if(string.contains(find)){
            return find;
        }
        else {
            return "字符串不包含该内容";
        }
    }


    public static void main(String[] args) {
        String a="我是你的小宝贝";
        Test test=new Test();

        System.out.println(test.findString(a,"我"));



    }
}
