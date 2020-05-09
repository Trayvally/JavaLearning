package Work4;

public class Game {
    public static void main(String[] args) {

        Poker pk=new Poker();             //实例化一个Poker对象

        Player pl1,pl2,pl3;               //实例化3个Player对象

        pl1=new Player();

        pl2=new Player();

        pl3=new Player();

        Dealer de=new Dealer();          //实例化一个Dealer对象

        pk.setCards(pk.numbers, pk.colors,pk.array);
//拿出一副扑克牌

        de.shuffleCard(pk.array);                            //发牌人洗牌

        de.sendCards(pk.array, pl1.card, pl2.card, pl3.card);  //发牌人发牌

        pl1.sortCards(pl1.card);                           //玩家1将牌排序

        pl2.sortCards(pl2.card);                           //玩家2将牌排序

        pl3.sortCards(pl3.card);                           //玩家3将牌排序

        System.out.println("\n玩家1的牌是：");

        pl1.showCards(pl1.card, pk.cards);

        System.out.println("\n玩家2的牌是：");

        pl2.showCards(pl2.card, pk.cards);

        System.out.println("\n玩家3的牌是：");

        pl3.showCards(pl3.card, pk.cards);

        System.out.println("\n底牌是：");

        de.showHand(de.hand, pk.cards);

    }
}
