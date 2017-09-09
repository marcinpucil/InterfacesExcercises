package Excercise6;

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
}
