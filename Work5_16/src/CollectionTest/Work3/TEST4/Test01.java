package CollectionTest.Work3.TEST4;

import java.util.HashSet;
import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        Random r = new Random();
        HashSet<Integer> hs = new HashSet<>();
        while(hs.size() < 10) {
            hs.add(r.nextInt(20) + 1);
        }
        // 遍历HashSet
        for (Integer integer : hs) {
            System.out.println(integer);
        }
    }

}
