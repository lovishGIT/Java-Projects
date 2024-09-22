package concept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferReaderLearn {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Number of rows: ");
        try {
            int n = Integer.parseInt(br.readLine());
            System.out.println("n= " + n);
        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        }

    }
}
