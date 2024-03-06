package tasks;

public class Task02FindOccurences {
    public static void main(String[] args) {
        String str = "aaabbbccdefgghhiijkkkk";
        //find out how many letter b are there in str

        int totalCount = getTotalCount(str, "d");
        System.out.println("totalCount = " + totalCount);
        
        //another approach with loop
        int countOfTargetChar = getCountOfTargetChar(str,'i');
        System.out.println("countOfTargetChar = " + countOfTargetChar);
    }

    private static int getTotalCount(String str, String d) {
        int len1 = str.length();
        int len2 = str.replace(d,"").length();
        int totalCount = len1 - len2;
        return totalCount;
    }

    private static int getCountOfTargetChar(String str, char targetChar) {
        int countOfTargetChar = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetChar) {
                countOfTargetChar++;
            }
        }
        return countOfTargetChar;
    }
}
