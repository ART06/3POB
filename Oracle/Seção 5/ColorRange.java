import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a color code");
        double wavelength = in.nextDouble();
        String color = "";

        if (wavelength >= 380 && wavelength < 450) {
            color = "Violeta";
        } else if (wavelength >= 450 && wavelength < 495) {
            color = "Azul";
        } else if (wavelength >= 495 && wavelength < 570) {
            color = "Verde";
        } else if (wavelength >= 570 && wavelength < 590) {
            color = "Amarelo";
        } else if (wavelength >= 590 && wavelength < 620) {
            color = "Laranja";
        } else if (wavelength >= 620 && wavelength < 750) {
            color = "Vermelho";
        } else {
            System.out.println("The entered wavelength is not a part of the visible spectrum");
            in.close();
            return;
        }

        // 4. Exibição da cor encontrada
        System.out.println("The color is " + color);
        
        in.close();
    }
}