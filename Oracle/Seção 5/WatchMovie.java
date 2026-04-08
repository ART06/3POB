import java.util.Scanner;

public class WatchMovie {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the movie ticket price: \n");
        double price = sc.nextDouble();
        
        System.out.print("Bote a avaliação do filme (1-5): \n");
        int rating = sc.nextInt();
        if (price >= 12 && rating == 5) {
            System.out.println("Estou interessado em assistir o filme.");
        } else {
            System.out.println("Não estou interessado em assistir o filme.");
        }
        
        sc.close();
    }
}