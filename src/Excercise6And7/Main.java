/*Excercise8
Korzystając z metod listFiles(FileFilter) i isDirectory z klasy java.io.File,
napisz metodę zwracającą wszystkie podkatalogi wskazanego katalogu. Wykorzystaj
wyrażenie lambda zamiast obiektu FileFilter. Wykonaj to samo za pomocą
wyrażenia z metodą i anonimowej klasy wewnętrznej.
 */

package Excercise6And7;


import java.io.File;

public class Main {


    public File[] getSubdirectories1(String dirAddress) {

        return null;
    }

    public File[] getSubdirectories2(String dirAddress) {
        File file = new File(dirAddress);
        if (file.isDirectory()) return file.listFiles();
        else return null;
    }


    public static void main(String[] args) {

    }

}