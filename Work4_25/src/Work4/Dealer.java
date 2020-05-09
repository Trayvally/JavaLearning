package Work4;

import java.util.Random;


public class Dealer {
    int[] hand=new int[3];

    void shuffleCard(int array[])               //洗牌

    {

        int temp=0;

        int rd1,rd2;

        for(int i=0;i<array.length;i++)

        {

            Random r1=new Random();            //产生两个随机数

            Random r2=new Random();

            rd1=r1.nextInt(54);

            rd2=r2.nextInt(54);

            temp=array[rd1];

            array[rd1]=array[rd2];

            array[rd2]=temp;

        }

    }



    void sendCards(int array[],int array1[],int array2[],int array3[])   //发牌

    {

        for(int i=0;i<array.length;i++)

        {

            if(i<51)

            {

                if(i%3==0)

                    array1[i/3]=array[i];

                if(i%3==1)

                    array2[i/3]=array[i];

                if(i%3==2)

                    array3[i/3]=array[i];

            }

            else

                hand[i-51]=array[i];

        }

    }

    void showHand(int hand[],String cards[])                      //显示底牌

    {

        for(int i=0;i<hand.length;i++)

        {

            System.out.print(" "+cards[hand[i]]);

        }

    }

}
