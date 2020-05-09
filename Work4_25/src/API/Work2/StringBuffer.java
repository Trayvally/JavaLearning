package API.Work2;


class Test{
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer();

        stringBuffer.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuffer.delete(0,4));
    }
}
