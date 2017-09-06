package Excercise3And4;

import java.util.Arrays;
import java.util.stream.IntStream;

class IntSequence {

    static Object of(int... ints) {
        return new Object() {
            private int[] intSequences = ints;

            @Override
            public String toString() {
                return "$classname{" +
                        "intSequences=" + Arrays.toString(intSequences) +
                        '}';
            }
        };
    }

    static int[] constant(int i) {
        return IntStream.iterate(i, operand -> operand).limit(100).toArray();
    }
}
