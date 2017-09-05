/*
Utwórz interfejs Measurable z metodą double getMeasure(), która dostarcza jakąś
metrykę obiektu. Zaimplementuj interfejs Measurable w klasie Employee. Utwórz
metodę double average(Measurable[] objects), która oblicza średnią metryk.
Wykorzystaj ją do obliczenia średniego wynagrodzenia pracowników, których dane
są zapisane w tablicy.
*/

package Excercise1;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee(3000);
        Employee employee2 = new Employee(2000);
        Employee employee3 = new Employee(1000);
        System.out.println(employee1.average(new Employee[]{employee1, employee2, employee3}));
    }
}