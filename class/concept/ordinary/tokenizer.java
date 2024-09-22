package concept.ordinary;

import java.util.StringTokenizer;

// better way to split a string

public class tokenizer {
    public static void main(String[] args) {
        String s = "hello world,hye world";
        StringTokenizer sc = new StringTokenizer(s, ",");
        // StringTokenizer sc = new StringTokenizer(s, ",", true); // this will return commas too.
        // for(sc.hasMoreElements())
        while(sc.hasMoreTokens()) {
            System.out.println(sc.nextToken());
        }
    }
}
