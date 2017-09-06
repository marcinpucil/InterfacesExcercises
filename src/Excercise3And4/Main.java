/*Excercise3
Zaimplementuj statyczną metodę of w klasie IntSequence, która zwraca ciąg
parametrów. Na przykład IntSequence.of(3, 1, 4, 1, 5, 9) zwraca ciąg sześciu
wartości. Dodatkowe punkty możesz dostać za zwrócenie instancji wewnętrznej
klasy anonimowej.

Excercise4
Zaimplementuj metodę statyczną constant w klasie IntSequence, która zwraca
nieskończony ciąg stałych. Na przykład IntSequence.constant(1) zwraca wartości
1 1 1 ..., w nieskończoność. Dodatkowe punkty za wykonanie tego za pomocą
wyrażenia lambda.
 */

package Excercise3And4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(IntSequence.of(1, 2, 3, 4, 5));
        System.out.println(Arrays.toString(IntSequence.constant(1)));
    }
}