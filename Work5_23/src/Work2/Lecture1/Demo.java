package Work2.Lecture1;

import java.util.HashSet;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        Random random=new Random();
        for (int i = 0; set.size()<10; i++){
            set.add(random.nextInt(19)+1);
        }

        System.out.println(set.toString());
    }
}
