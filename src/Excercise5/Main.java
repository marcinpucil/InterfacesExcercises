/*Excercise5
Zaimplementuj metodę void luckySort(ArrayList<String> strings,
Comparator<String> comp), która wywołuje Collections.shuffle na tablicy
typu ArrayList do chwili, gdy elementy będą uporządkowane rosnąco w sposób
określony przez komparator.
 */

package Excercise5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("cos");
        strings.add("kots");
        strings.add("ja");
        strings.add("a");
        strings.add("dziala");
        main.luckySort(strings, Comparator.naturalOrder());

        main.test();
    }

    void test() {
        ArrayList<String> strings1 = new ArrayList<>();
        ArrayList<String> strings2 = new ArrayList<>(strings1);
        strings1.add("c");
        strings1.add("s");
        strings1.add("d");
        System.out.println(strings1);
        //strings2.sort(Comparator.naturalOrder());
        System.out.println(strings2);
        System.out.println(strings1 == strings2);
        System.out.println(Arrays.equals(strings1.toArray(), strings2.toArray()));
    }

    void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        ArrayList<String> strings1 = new ArrayList<>(strings);
        strings1.sort(comp);
        int i = 0;
        while (Arrays.deepEquals(strings.toArray(), strings1.toArray())) {
            Collections.shuffle(strings);
            i++;
        }
        System.out.println(i);
    }
}