package Work4;

public class Player {
    int[] card=new int[17];

    void sortCards(int card[])                       //将牌排序

    {

        int temp;

        for(int i=0;i<card.length-1;i++)              //冒泡排序法

            for(int j=0;j<card.length-1-i;j++)

            {

                if(card[j]>card[j+1])

                {

                    temp=card[j];

                    card[j]=card[j+1];

                    card[j+1]=temp;

                }

            }

    }



    void showCards(int card[],String cards[])
//将牌展示出来

    {

        for(int i=0;i<card.length;i++)

        {

            System.out.print(" "+cards[card[i]]);

        }

    }

}
