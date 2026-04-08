import java.util.Scanner;

public class ProcessName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type your name: ");
        
        String fullName = sc.nextLine();
        
        int spaceIdx = fullName.indexOf(" ");
        
        String firstName = fullName.substring(0, spaceIdx);
        
        String lastName = fullName.substring(spaceIdx + 1);
        
        char initial = firstName.charAt(0);
        
        System.out.println("Your name is: " + lastName + ", " + initial + ".");
        
        sc.close();
    }
}