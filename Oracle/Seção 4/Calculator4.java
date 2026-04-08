public class Calculator4 {
    public double tax = .05;
    public double tip = .15;
    
    public double findTotal(double price, String name){
        double total = price * (1 + tax + tip);
        System.out.println(name + ": $" + total);
        return total;
    }
}