import java.util.Scanner;
import java.util.regex.MatchResult;

public class Input04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(Input04.class.getResourceAsStream("input04text.txt"));

        sc.findWithinHorizon("BlueBumper\\s+(\\d+)\\s+(\\d+)", 0);

        MatchResult result = sc.match();

        System.out.println("'BlueBumper' localizado");
        System.out.println("X: " + result.group(1) + ", Y: " + result.group(2));

        sc.close();
    }
}