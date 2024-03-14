package day08.apps;

//public final abstract class Gaming extends App{
public abstract class Gaming extends App{

    // The class is abstract, so it doesn't need to implement the abstract methods that are inherited. It can also declare more abstract methods if needed

    //Q: Can you implement the methods in this class?

    public abstract void play();

}

class CydeoLearning extends Gaming implements InAppPurchase {
    @Override
    public void launch() {
        System.out.println("Launching Cydeo Learning...");
    }

    @Override
    public void play() {
        System.out.println("Opening next level");
    }

    @Override
    public boolean purchase(double amount) {
        if(amount >= 1.99) {
            System.out.println("Hints unlocked");
            return true;
        }
        return false;
    }
}

