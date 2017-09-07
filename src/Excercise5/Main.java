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


    void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        ArrayList<String> strings1 = new ArrayList<>(strings);
        strings1.sort(comp);
        int i = 0;
        while (Arrays.deepEquals(strings.toArray(), strings1.toArray()) == false) {
            Collections.shuffle(strings);
            i++;
        }
        System.out.println("Wykonano ileracji:" + i);
    }


    public static void main(String[] args) {
        Main main = new Main();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("cos");
        strings.add("kots");
        strings.add("ja");
        strings.add("a");
        strings.add("dziala");
        main.luckySort(strings, Comparator.naturalOrder());

    }
}