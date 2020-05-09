package API.Work4;

public class Test {
    public static void main(String[] args) {
        String str="To be or not to be";
        String result="";
        String[] temp=str.split(" ");
        for (int i=0;i<temp.length;i++){
            String word=temp[i];
            //单词倒置
            String reverse="";
            for (int j=word.length()-1;j>=0;j--){
                char c=word.charAt(j);
                reverse+=c;
            }
            result+=reverse+" ";
        }
        System.out.println(result);
    }
}
