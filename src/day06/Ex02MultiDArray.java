package day06;

public class Ex02MultiDArray {
    public static void main(String[] args) {
        String[][] users = {
                {"user4433", "abc442"},
                {"user1133", "ade442"},
                {"userdd33", "a12442"}
        };

        //print all userIds and passwords
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users[i].length; j++) {
                System.out.print(users[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println(users[1][0]);

        //for each loop

        for(String[] user : users) {
            for(String value : user) {
                System.out.print(value +" ");
            }
            System.out.println();
        }

    }
}
