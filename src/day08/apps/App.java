package day08.apps;

public abstract class App {
    public abstract void launch();
}

class Discord extends App {
    @Override
    public void launch() {
        System.out.println("Connecting to Discord servers...");
    }
}

class Instagram extends App implements Stories {
    @Override
    public void launch() {
        System.out.println("Connecting to Instagram servers...");
    }

    @Override
    public void createStory() {
        System.out.println("Creating story on instagram");
    }

    @Override
    public void viewStory() {
        System.out.println("Viewing story");
    }
}
