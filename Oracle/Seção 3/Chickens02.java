public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
        int segunda = 100;
        int terca = 121;
        int quarta = 117;

        double dailyAverage = (segunda + terca + quarta) / 3.0;

        double monthlyAverage = dailyAverage * 30;

        double monthlyProfit = monthlyAverage * 0.18;

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
