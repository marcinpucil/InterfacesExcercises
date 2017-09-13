/*Excercise10
Zaimplementuj RandomSequence z podrozdziału 3.9.1, „Klasy lokalne”, jako klasę
zagnieżdżoną poza metodą randomInts.
*/

package Excercise10;

import java.util.Random;

public class Main {
    private static Random generator = new Random();
    private int low;
    private int high;

    public static void main(String[] args) {
        Main main = new Main();
//        while (main.randomInts(1, 10).hasNext()) {
//            System.out.println(main.randomInts(1, 10).next());
//        }
        System.out.println(main.randomInts(1, 10).next());
        System.out.println(main.randomInts(1, 10).hasNext());
    }

    RandomSequence randomInts(int low, int high) {
        this.low = low;
        this.high = high;
        return new RandomSequence();
    }

    class RandomSequence {
        int next() {
            return low + generator.nextInt(high - low + 1);
        }

        boolean hasNext() {
            return true;
        }
    }
}