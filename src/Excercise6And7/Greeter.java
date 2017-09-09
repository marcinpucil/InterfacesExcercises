package Excercise6And7;


import java.util.stream.Stream;

public class Greeter implements Runnable {

    private String target;
    private int n;

    Greeter(String target, int n) {
        this.target = target;
        this.n = n;
    }

    @Override
    public void run() {
        new Thread(() -> {
            for (int i = 0; i < n; i++) {
                System.out.println("Witaj " + target);
            }
        }).start();
    }


    public static void runTogether(Runnable... tasks) {
        Stream.of(tasks).forEach(runnable -> new Thread(runnable).run());
    }

    public static void runInOrder(Runnable... tasks) {
        Stream.of(tasks).forEach(Runnable::run);
    }
}
