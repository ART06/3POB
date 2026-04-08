import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Choose a number: ");
        int num = console.nextInt();
        
        for (int i = 1; i <= 12; i++) {
            int result = num * i;
            
            System.out.println(num + "x" + i + " = " + result);
        }
        
        console.close();
    }
}