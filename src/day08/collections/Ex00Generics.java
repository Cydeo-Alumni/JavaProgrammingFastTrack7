package day08.collections;

public class Ex00Generics {
    public static void main(String[] args) {
//        Anything<> anything = new Anything<>(); need to define a type
        Anything<String> anything = new Anything<>();
        anything.value = "hello";
        System.out.println(anything.value);
        anything.method("Java");

        Anything<Integer> other = new Anything<>();
        other.value = 25;
        System.out.println(other.value);
        other.method(1);

        // Use cases:

//        List //List<E>

        //Map //Map<K, V>

        // Functional Interfaces

    }
}

class Anything<T> {
    //Anything<Integer> v = new Anything();
    T value;

    void method(T t) {
        if (t instanceof String) {
            System.out.println(((String) t).charAt(0));
        } else if (t instanceof Integer) {
            System.out.println((Integer) t + 100);
        }
    }

    T method2() {
        return null;
    }
}
