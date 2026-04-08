import java.util.Random;

public class ComputeMethods {
    
    public double fToC(double degreesF) {
        return (5.0 / 9.0) * (degreesF - 32);
    }
    
    public double hypotenuse(int a, int b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
    
    public int roll() {
        Random rand = new Random();
        // nextInt(6) gera 0-5, somamos 1 para ser 1-6
        int dado1 = rand.nextInt(6) + 1;
        int dado2 = rand.nextInt(6) + 1;
        return dado1 + dado2;
    }
}