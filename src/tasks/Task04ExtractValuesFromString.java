package tasks;

public class Task04ExtractValuesFromString {
    public static void main(String[] args) {
        String str = "40% off Deal $59.99 List Price: $99.99";

        int percentage = Integer.parseInt(str.substring(0, str.indexOf("%")));
        System.out.println("percentage = " + percentage);

        double dealPrice = Double.parseDouble(str.substring(str.indexOf("$") + 1 , str.indexOf(" List") ));
        System.out.println("dealPrice = " + dealPrice);

        double listPrice = Double.parseDouble(str.substring(str.lastIndexOf("$")+1));
        System.out.println("listPrice = " + listPrice);

    }
}
