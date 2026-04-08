public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        //primeiro cenario
        int totalEggs = 0, eggsPerChicken = 5, chickenCount = 3;

        //segunda
        totalEggs += chickenCount * eggsPerChicken;

        //terça
        chickenCount++;
        totalEggs += chickenCount * eggsPerChicken;

        //quarta
        chickenCount /= 2;
        totalEggs += chickenCount * eggsPerChicken;
        System.out.println(totalEggs);

        totalEggs=0;
        //segundo cenario

        chickenCount = 8;
        eggsPerChicken = 4;

        //segunda
        totalEggs += chickenCount * eggsPerChicken;

        //terça
        chickenCount++;
        totalEggs += chickenCount * eggsPerChicken;

        //quarta
        chickenCount /= 2;
        totalEggs += chickenCount * eggsPerChicken;
        System.out.println(totalEggs);
    }
}
