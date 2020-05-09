package API.Work3;

public class Test<AbstractStringBuilder> {



    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("ABCDEFGHIJKLMN");
        System.out.println(stringBuffer);
        Test test=new Test();
        test.partReverse(stringBuffer,2,8);
    }

    public void partReverse(StringBuffer stringBuffer,int start,int end) {
        if (start<end&&end<stringBuffer.length()){
            String temp=new StringBuffer(stringBuffer.substring(start,end)).reverse().toString();
            stringBuffer.delete(start,end);
            System.out.println(temp);
            System.out.println(stringBuffer.insert(start,temp));
        }else {
            System.out.println("Error Input");
        }

    }
}
