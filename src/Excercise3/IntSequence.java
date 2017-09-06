package Excercise3;

import java.util.Arrays;

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
}
