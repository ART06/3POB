import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();
        
        boolean drivingUnderAge = false;
        
        if (idade <= 18) {
            drivingUnderAge = true;
        }
        
        System.out.println("Dirigindo abaixo da idade permitida? " + drivingUnderAge);
        
        sc.close();
    }
}