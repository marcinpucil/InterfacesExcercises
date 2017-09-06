/*Excercise1
Utwórz interfejs Measurable z metodą double getMeasure(), która dostarcza jakąś
metrykę obiektu. Zaimplementuj interfejs Measurable w klasie Employee. Utwórz
metodę double average(Measurable[] objects), która oblicza średnią metryk.
Wykorzystaj ją do obliczenia średniego wynagrodzenia pracowników, których dane
są zapisane w tablicy.
*/
/*Excercise2
Kontynuując poprzednie ćwiczenie, utwórz metodę Measurable
largest(Measurable[] objects). Wykorzystaj ją do ustalenia nazwiska pracownika
z najwyższym wynagrodzeniem. Do czego użyjesz rzutowania?
 */

package Excercise1And2;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Edek", 3000);
        Employee employee2 = new Employee("Fredek", 2000);
        Employee employee3 = new Employee("Nicpoń", 1000);
        System.out.println(employee1.average(new Employee[]{employee1, employee2, employee3}));
        System.out.println(employee1.measureLargest(new Employee[]{employee1, employee2, employee3}));
    }
}