/*Excercise8
Korzystając z metod listFiles(FileFilter) i isDirectory z klasy java.io.File,
napisz metodę zwracającą wszystkie podkatalogi wskazanego katalogu. Wykorzystaj
wyrażenie lambda zamiast obiektu FileFilter. Wykonaj to samo za pomocą
wyrażenia z metodą i anonimowej klasy wewnętrznej.
 */

package Excercise6And7;


import java.io.File;
import java.io.FileFilter;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        Main main = new Main();

        Stream.of(main.getSubdirectories1("D:\\nauka programowania")).forEach(file -> System.out.println(file.getAbsoluteFile()));
        Stream.of(main.getSubdirectories2("D:\\nauka programowania")).forEach(file -> System.out.println(file.getAbsoluteFile()));
    }

    File[] getSubdirectories2(String dirAddress) {
        return new File(dirAddress).listFiles(File::isDirectory);
    }

    File[] getSubdirectories1(String dirAddress) {
        return new File(dirAddress).listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });
    }

}