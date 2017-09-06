package Excercise1And2;


import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Employee implements Measurable {

    private String name;
    private double salary = 0;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public double getMeasure() {
        return this.salary;
    }

    public double average(Measurable[] measurables) {
        return
                Arrays.stream(measurables).collect(Collectors.averagingDouble(Measurable::getMeasure));
    }

    @Override
    public String measureLargest(Measurable[] measurable) {
        return Arrays.stream(measurable).max(Comparator.comparingDouble(Measurable::getMeasure)).toString();
    }

}