/*Excercise6
Zaimplementuj klasę Greeter, która implementuje interfejs Runnable i w której metoda
run wyświetla n kopii tekstu "Witaj, " + target, gdzie n i target są ustawiane
w konstruktorze. Stwórz dwie instancje z różnymi komunikatami i wykonaj je
równolegle w dwóch wątkach.
 */

package Excercise6;


public class Main {


    public static void main(String[] args) {

        Greeter greeter = new Greeter("użytkowniku", 10);
        greeter.run();
        Greeter greeter1 = new Greeter("gościu", 5);
        greeter1.run();
    }

}