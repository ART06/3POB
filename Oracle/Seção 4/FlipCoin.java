import java.util.Random;

public class FlipCoin {

    public static void main(String[] args) {

        // 50% chance heads, 50% chance tails
        Random rand = new Random();
        double chance = rand.nextDouble();
        String result;
        System.out.println(chance);

        if (chance < 0.5) {
                result = "Superior";
            } else {
                result = "Inferior";
            }

        System.out.println("Resultado: " + result);
    }
}
