import com.sun.org.apache.xpath.internal.operations.String;

import java.sql.Time;
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        StringBuffer s = new StringBuffer();

        System.out.println("Hello world!");
////        impact : [5,3,4,2,6]
////        chain: [4,1,0,0,4]
//
//
//        3 -> 5 -> 2-> null; 5
//        6->2 6
//        4->0 4
//        15
//
//
//        5 3 6 1 2 8
//        0 1 1 2 2 3
//        15
//                5->0
//                3->5
//                6-5
//                1-3 ....
//                2-3-5
//                8-6-5
//1, 2,8
//
//
//        3 2 1 4 5
//        0 1 1 1 0
//        14
//
//                [1,2,5,8]
//

        // If you have a random function that creates a result between 0 - 232,  DONE
        // how do you generate a random number between 0 and 50? //
        // What do we do if we don"t want this function to return the same value until all values are generated once?

//        Supplier<Integer> sup =   () -> (int) (Math.random() * 1000)%232;
//
//        Set<Integer> res = new HashSet<>();
//
//
//        while (res.size()<50){
//            res.add(sup.get()%50);
//        }
//        System.out.println(res);

        RandomGen r = new RandomGen(50);
int i=0;
        while(i<55){
            Thread.sleep(100);
//            r.getRandom();
            System.out.println(r.getRandom());
            i++;

        }

    }



}

class RandomGen{
    private static int  count = 0;
    private final int range;
    List<Integer> integerList = new ArrayList<>();
    Set<Integer> set = new HashSet<>();

    public RandomGen(int range){
        this.range=range;
        generateIntegerList();
    }

    public int getRandom(){
//        System.out.println(count);
        resetCounter();
        return integerList.get(count);
    }

    private void generateIntegerList(){
        Supplier<Integer> sup =   () -> (int) (Math.random() * 1000)%232;

        while (set.size()<range){
            set.add(sup.get()%range);
        }
        integerList = new ArrayList<>(set);
        Collections.shuffle(integerList);
    }

    private void resetCounter(){
//        System.out.println(count);
        count++;
        if(count>=range){
            System.out.println(count);
            count = 0;
            Collections.shuffle(integerList);
        }

    }




}