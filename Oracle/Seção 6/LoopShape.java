public class LoopShape {
    
    static void createRectangle(int width, int height) {
        if (width < 1 || height < 1) {
            System.out.println("Erro: Dimensões devem ser pelo menos 1.");
            return;
        }

        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    static void createTriangle(int leg) {
        if (leg < 1) {
            System.out.println("Erro: O tamanho da perna deve ser pelo menos 1.");
            return;
        }

        for (int i = 1; i <= leg; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
    }
}