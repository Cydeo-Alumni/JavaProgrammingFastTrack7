package day08.collections;

import java.util.*;

public class Ex09Countries {
    public static void main(String[] args) {

        // key - countries - String
        // value = cities - List<String>
        Map<String, List<String>> countries = new HashMap<>();
        countries.put("United States", new ArrayList<>(Arrays.asList("Chicago", "Dallas", "Irvine", "San Diego", "New York", "Philadelphia", "Madison")));

        System.out.println("MAP " + countries);

        System.out.println("------------------------------------");

        countries.get("United States").add("Seattle");
        System.out.println("ARRAYLIST " + countries.get("United States"));
        System.out.println("FIRST CITY " + countries.get("United States").get(0)); // first get is from map, then second get is from arraylist

        countries.put("England", new ArrayList<>(Arrays.asList("London", "Manchester", "Cambridge", "York", "Liverpool", "Nottingham", "Oxford")));
        countries.put("Uzbekistan", new ArrayList<>(Arrays.asList("Tashkent", "Samarkand", "Bukhara", "Fergana", "Urgench", "Khiva", "Bakht")));
        countries.put("Kazakhstan", new ArrayList<>(Arrays.asList("Petropavlovsk", "Astana", "Almaty", "Aktobe", "Kokshetau")));

        System.out.println("------------------------------------");

        System.out.println(countries);

        Scanner input = new Scanner(System.in);
        System.out.println("What country are you going to tour " + countries.keySet());
        String country = input.nextLine();

        for (String eachCity : countries.get(country)) { // iterate though each city of a specific country
            System.out.println("Touring.... " + eachCity);
        }

        System.out.println("------------------------------------");

        for (Map.Entry<String, List<String>> eachEntry : countries.entrySet()) {
            for (String eachCity : eachEntry.getValue()) {// the value of each Entry was the cities
                if (eachCity.startsWith("A") || eachCity.endsWith("a")) {
                    System.out.println(eachCity);
                }
            }
        }

//        for (List<String> eachCountry : countries.values()) {
//            for (String eachCity : eachCountry) {
//                System.out.println(eachCity);
//            }
//        }

    }
}