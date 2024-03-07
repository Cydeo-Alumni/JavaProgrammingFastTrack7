package day04;

public class Ex01Methods {
    public static void main(String[] args) {
        greetEveryone();
        System.out.println(getGreeting());
        printEmail("mike smith", "google");
        System.out.println(getLast3FromString("hello world"));
        System.out.println(getLast3FromString("ab"));
        String s = null;
        System.out.println(getLast3FromString(s));
    }
    //Void , no params
    public static void greetEveryone() {
        System.out.println("Hello everyone!");
    }
    //Return string, no params
    public static String getGreeting() {
        return "Hello All!";
    }

    //Void , has params
    public static void printEmail(String name, String company) {
        System.out.println(name.replace(" ","")+"@"+company+".com");
    }

    //return value , has params. "hello world" -> "rld
    public static String getLast3FromString(String str) {
            //true           NullP ex
        if (str == null || str.length() < 3) { //TRUE
            return str; //return string as is if less than 3 char
        }
        return str.substring(str.length()-3);
    }

}















