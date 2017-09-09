/*Excercise6
Zaimplementuj klasę Greeter, która implementuje interfejs Runnable i w której metoda
run wyświetla n kopii tekstu "Witaj, " + target, gdzie n i target są ustawiane
w konstruktorze. Stwórz dwie instancje z różnymi komunikatami i wykonaj je
równolegle w dwóch wątkach.
Excercise7
Zaimplementuj metody:
public static void runTogether(Runnable... tasks)
public static void runInOrder(Runnable... tasks)
Pierwsza metoda powinna uruchomić każde zadanie w oddzielnym wątku i zakończyć
działanie. Druga metoda powinna uruchomić wszystkie zadania w bieżącym wątku
i zakończyć działanie po zakończeniu ostatniego z nich.
 */

package Excercise6And7;


public class Main {


    public static void main(String[] args) {

        Greeter greeter = new Greeter("użytkowniku", 10);
        greeter.run();
        Greeter greeter1 = new Greeter("gościu", 5);
        greeter1.run();
        Runnable something = () -> System.out.println("something");
        Runnable just = () -> System.out.println("just");
        Runnable like = () -> System.out.println("like");
        Runnable aThis = () -> System.out.println("this");
        Greeter.runTogether(something,
                just, like, aThis);
        Greeter.runInOrder(something, just, like, aThis);

    }

}