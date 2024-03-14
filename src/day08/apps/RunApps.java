package day08.apps;

public class RunApps {
    public static void main(String[] args) {

//        App app = new App(); cannot instantiate App
        // app.launch() is not possible because we need an object & the method is abstract

        Discord discord = new Discord();
        discord.launch();
        Instagram instagram = new Instagram();
        instagram.launch();

        System.out.println(Stories.lengthLimit);
        System.out.println(instagram.lengthLimit);

        System.out.println("------------------------");

//        Gaming gaming = new Gaming(); abstract class
//        InAppPurchase inAppPurchase = new InAppPurchase(); interface

        CydeoLearning cl = new CydeoLearning();
        cl.launch();
        cl.play();
        cl.purchase(3.00);
        //System.out.println(cl.CURRENCY); variable is inherited
        //System.out.println(cl.convertCurrency("euro", 150));  static methods are not inherited

        System.out.println("------------------------");

        System.out.println(InAppPurchase.CURRENCY);
        System.out.println(InAppPurchase.convertCurrency("euro", 150));

        System.out.println("------------------------");

        cl.emailSubscription("javaiscool@gmail.com");
        //InAppPurchase.emailSubscription("javaiscool@gmail.com");

    }
}
