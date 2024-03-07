package day04;

public class Ex04MethodChaining {
    public static void main(String[] args) {
        String city = "Mclean";
        int l = city.toUpperCase().replace("L", "l").length();
        System.out.println("l = " + l);
        StringBuilder stb = new StringBuilder("java");
        stb.append("python")
                .append("ruby")
                .append("kotlin");
        System.out.println("stb = " + stb);
                            //String obj
        System.out.println(getCountry().toUpperCase());
    }

    public static String getCountry() {
        return "Canada";
    }
}
