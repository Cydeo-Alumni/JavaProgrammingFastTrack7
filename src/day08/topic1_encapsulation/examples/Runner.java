package day08.topic1_encapsulation.examples;

public class Runner {
    public static void main(String[] args) {

        Records records = new Records();
        records.setInfo("Gold Record");
        System.out.println(records.getInfo());

        Person person = new Person("New York");
        System.out.println(person.getBirthLocation());
       // System.out.println(person.birthLocation);
        //person.setBirthLocation(); no setters in Person class

        Budget budget = new Budget();
        budget.setAnnualBudget(100_000_000);
        // other methods here
        // there is no getter, so we will never be able to read(get) the value
        AttendanceRecords atr = new AttendanceRecords();
        atr.setInfo("java review class");
        System.out.println(atr.getInfo());
    }
}
