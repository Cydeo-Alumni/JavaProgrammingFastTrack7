package day01;

public class Ex06Conditional {
    public static void main(String[] args) {
        int day = 7; //1 - 7
        //negative check. if value is invalid or null etc
        if (day < 1 || day > 7) {
            System.out.println("Invalid day");
            return; //exit method
        }

        if (day == 1) {
            System.out.println("Monday");
        } else if(day == 2) {
            System.out.println("Tuesday");
        }else if(day == 3) {
            System.out.println("Wednesday");
        }else if(day == 4) {
            System.out.println("Thursday");
        }else if(day == 5) {
            System.out.println("Friday");
        }else if(day == 6) {
            System.out.println("Saturday");
        }else if(day == 7) {
            System.out.println("Sunday");
        }
//        }else {
//            System.out.println("Not needed");
//        }

        System.out.println("----------------------------");
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
        }
        System.out.println("------------------");
        //weekday or weekend
        String typeOfDay = (day <= 5)? "weekday" : "weekend";
        System.out.println("typeOfDay = " + typeOfDay);
    }
}
