package day08.apps;

public interface InAppPurchase {

    boolean purchase(double amount); // public abstract

    String CURRENCY = "Dollars"; // public static final

    static double convertCurrency(String currencyType, double amount){
        switch (currencyType.toLowerCase()){
            case "euro": return amount * 1.07;
            case "peso": return amount * 0.052;
            case "yen": return amount * 0.0076;
            default:
                System.out.println(currencyType + " cannot be converted at this time");
        }
        return 0.0;
    }

    default void emailSubscription(String email){
        System.out.println("Enrolled " + email + " to mail list");
    }

}
