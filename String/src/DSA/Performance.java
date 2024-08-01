package DSA;

public class Performance {
    public static void main(String[] args) {
        //print alphabets from a to z
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series += ch;
        }
        System.out.println(series);

        //here everytime the loop runs it creates a new object which is not optimised , the time complexity is O(n^2)
        //since the strings are immutable they cant be used for such solution
        // we have to use any data structure that does not create the new object ,alters the original one
        //for that we can use StringBuilder
    }
}
