/*Excercise8
Korzystając z metod listFiles(FileFilter) i isDirectory z klasy java.io.File,
napisz metodę zwracającą wszystkie podkatalogi wskazanego katalogu. Wykorzystaj
wyrażenie lambda zamiast obiektu FileFilter. Wykonaj to samo za pomocą
wyrażenia z metodą i anonimowej klasy wewnętrznej.
Excercise9
Korzystając z metody list(FilenameFilter) klasy java.io.File, napisz metodę
zwracającą wszystkie pliki ze wskazanego katalogu ze wskazanym rozszerzeniem.
Użyj wyrażenia lambda, a nie FilenameFilter. Jakie zmienne zewnętrzne
wykorzystasz.
Excercise10
Mając tablicę obiektów File, posortuj je w taki sposób, by katalogi znalazły się
przed plikami, a w każdej grupie elementy zostały posortowane według nazwy.
Użyj wyrażenia lambda przy implementowaniu interfejsu Comparator.
 */


package Excercise8And9;


import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
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
    public static void main(String[] args) {
        Main main = new Main();
        Stream.of(main.getSubdirectories1("D:\\nauka programowania")).forEach(file -> System.out.println(file.getAbsoluteFile()));
        Stream.of(main.getSubdirectories2("D:\\nauka programowania")).forEach(file -> System.out.println(file.getAbsoluteFile()));
        System.out.println("");
        Arrays.stream(main.getFilesByExtension("D:\\nauka programowania", ".txt")).forEach(file -> System.out.println(file.getAbsoluteFile()));
        Arrays.stream(main.getFilesSortedByNaturalOrder("D:\\nauka programowania")).forEach(file -> System.out.println(file.getAbsoluteFile()));
    }
    public File[] getFilesByExtension(String direction, String extension) {
        return new File(direction).listFiles(pathname -> pathname.getName().endsWith(extension));
    }

    public File[] getFilesSortedByNaturalOrder(String direction) {
        File[] files = getSubdirectories1(direction);
        return Arrays.stream(files).sorted((Comparator.comparing(File::getName))).toArray(File[]::new);
    }
}