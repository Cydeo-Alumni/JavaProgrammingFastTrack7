package day08.topic3_polymorphism;

public abstract class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

abstract class Employee extends Person{

    String jobTitle;
    double salary;

    public Employee(String name, String jobTitle, double salary) {
        super(name);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}

interface CreateSmokeTest {
    void create();
}

final class Tester extends Employee implements CreateSmokeTest{

    public Tester(String name, String jobTitle, double salary) {
        super(name, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println("running test cases");
    }

    @Override
    public void create() {
        System.out.println("Creating automatic smoke test");
    }

    public void writeBugReport(){
        System.out.println("Found bug, writing report");
    }
}