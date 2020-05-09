package Work4;

public class Poker {
    String[] numbers= {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};       //点数

    String[] colors= {"黑桃","红桃","方块","梅花"};                                     //花色

    String[] cards=new String[54];

    int[] array=new int[54];                                  //编号

    void setCards(String numbers[],String colors[],int array[])

    {

        for(int i=0;i<array.length;i++)

            array[i]=i;

        int k=0;

        for(int i=0;i<numbers.length;i++)

            for(int j=0;j<colors.length;j++)

            {

                cards[k]=colors[j]+numbers[i];     //将花色和点数拼接在一起存在cards数组中

                k=k+1;
            }

        cards[52]="大王";                 //将大王，小王加入牌中

        cards[53]="小王";

    }

}
