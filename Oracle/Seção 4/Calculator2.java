public class Calculator2 {
    public double tax = .05;
    public double tip = .15;
    public double originalPrice = 0;
    
    public void findTotal(){
        double total = originalPrice * (1 + tax + tip);
        System.out.println("Total individual: $" + total);
    }
}