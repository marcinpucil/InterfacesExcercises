package Excercise1;


import java.util.Arrays;
import java.util.stream.Collectors;

public class Employee implements Measurable {

    private double salary = 0;

    public Employee(double salary) {
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    public double average(Measurable[] measurables) {
        return
                Arrays.stream(measurables).collect(Collectors.averagingDouble(Measurable::getMeasure));
    }
}
