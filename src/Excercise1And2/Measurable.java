package Excercise1And2;

public interface Measurable {

    double getMeasure();

    double average(Measurable[] measurables);

    String measureLargest(Measurable[] measurable);
}