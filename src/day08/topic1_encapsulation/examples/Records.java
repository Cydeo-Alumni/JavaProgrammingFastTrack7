package day08.topic1_encapsulation.examples;

public class Records { // normal encapsulation
    private String info;

    public String getInfo() {
        return info;
    }
    /*
        String str = null; not pointing to any object in heap
        String str = ""; it is empty string, length is zero
     */
    public void setInfo(String info) {
        if (info == null || info.isEmpty()) {
            throw new IllegalArgumentException("info cannot be null or empty");
        }
        this.info = info;
    }
}
