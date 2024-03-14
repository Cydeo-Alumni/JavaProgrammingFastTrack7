package day08.topic3_polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Scrum {

    public static void main(String[] args) {

        // Reference of super classes

        Person tester1 = new Tester("James", "Secret Agent", 150_000);
        System.out.println(tester1);

        // tester1 can access the name variable

        System.out.println(tester1.name);

        // these are not accessible because the Person reference doesn't have to access to them
//        tester1.work();
//        tester1.create();

        System.out.println("------------------------------------------------");

        Employee tester2 = new Tester("Jose", "SDET", 200_000);
        System.out.println(tester2);

        // in total tester2 has access to name, jobTitle, salary, work()
        System.out.println(tester2.salary);
        tester2.work();

        System.out.println("------------------------------------------------");

        Object tester3 = new Tester("Milana", "Senior Tester", 300_000);
        // tester3 doesn't have access to anything new. Nothing from Person, Employee, or Tester
        // all invalid:
//        tester3.work(0);
//        tester3.name;
//        tester3.salary;
        System.out.println(tester3.toString());

        // reference of the interface

        System.out.println("------------------------------------------------");
        //upcasting to parent interface
        CreateSmokeTest tester4 = new Tester("Merve", "SDET", 203_000);
//        tester4.work();
        tester4.create();

        ((Tester)tester4).work();
        //downcast reference to Tester
        Tester tester = (Tester)tester4;
        tester.writeBugReport();
        //upcasting: implicit,
        Employee emp = tester;


        ((Tester)(tester4)).writeBugReport();
        ((Employee)(tester4)).work();

        // tester4 has access to the create() method

        // reference of itself
        Tester tester5 = new Tester("Rose", "QA", 320_000);
        tester5.writeBugReport();
        tester5.create();
        tester5.work();
        System.out.println(tester5);

        // tester5 has access to everything

        System.out.println("------------------------------------------------");

        List<Employee> allEmployees = new ArrayList<>();
        allEmployees.add((Employee) tester1);
        allEmployees.add((Employee) tester2);
        allEmployees.add((Employee) tester3);
        allEmployees.add((Employee) tester4);
        allEmployees.add((Employee) tester5); // up casting automatic
        System.out.println(allEmployees);

        System.out.println(maxSalary(allEmployees));

        System.out.println(inScrumTeam(allEmployees.get(0)));
        // isScrumTeam(new Chef()) --> false
        // isScrumTeam(new CEO()) --> false
        // isScrumTeam(new Developer()) --> true


    }

    public static Employee maxSalary(List<Employee> allEmployees){
        Employee biggestSalary = allEmployees.get(0); // default

        for(Employee each : allEmployees){
            if(each.salary > biggestSalary.salary){
                biggestSalary = each;
            }
        }

        return biggestSalary;
    }

    public static boolean inScrumTeam(Employee employee) {
        return employee instanceof Tester; // || employee instanceof Developer
    }

}


