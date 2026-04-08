import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        
        System.out.println("Enter a number (1-10):");
        num = in.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("O número é " + num + ", par");
        } else {
            System.out.println("O número é " + num + ", ímpar");
        }
        
        in.close();
    }
}