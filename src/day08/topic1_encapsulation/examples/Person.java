package day08.topic1_encapsulation.examples;

public class Person {  // only getter makes it Read-only
    private final String birthLocation; // why not make it static? Because each Person has their own location, so it should be unique for each object

    public Person(String birthLocation) {
        this.birthLocation = birthLocation;
    }

    public String getBirthLocation() {
        return birthLocation;
    }
}
