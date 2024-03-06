package tasks;

import org.junit.jupiter.api.Assertions;

import java.text.DecimalFormat;

public class Task04ExtractValuesFromString {
    public static void main(String[] args) {
        String str = "40% off Deal $59.99 List Price: $99.99";

        int percentage = Integer.parseInt(str.substring(0, str.indexOf("%")));
        System.out.println("percentage = " + percentage);

        double dealPrice = Double.parseDouble(str.substring(str.indexOf("$") + 1 , str.indexOf(" List") ));
        System.out.println("dealPrice = " + dealPrice);

        double listPrice = Double.parseDouble(str.substring(str.lastIndexOf("$")+1));
        System.out.println("listPrice = " + listPrice);
                                                //calculate discount amount
        double expPriceAfterDiscount = listPrice - (listPrice * percentage/100.0);
        //59.99399999999999 need to convert to 59.99, only 2 decimal places
        DecimalFormat decimalFormat = new DecimalFormat("##.00");
        //format and assign back to variable.
        expPriceAfterDiscount = Double.parseDouble(decimalFormat.format(expPriceAfterDiscount));

        System.out.println("expPriceAfterDiscount = " + expPriceAfterDiscount);

        Assertions.assertEquals(expPriceAfterDiscount, dealPrice);
        
    }
}
