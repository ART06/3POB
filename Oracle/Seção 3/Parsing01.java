public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "15";
        String taxRate = "0.05";
        String gibberish = "887ds7nds87dsfs";
        
        //Parse shirtPrice and taxRate, and print the total tax
        int price = Integer.parseInt(shirtPrice);
        double tax = Double.parseDouble(taxRate);
        
        double totalTax = price * tax;
        System.out.println("O imposto total é: " + totalTax);
        
        //Try to parse taxRate as an int
        //int taxInt = Integer.parseInt(taxRate);
        
        //Try to parse gibberish as an int
        //int gibInt = Integer.parseInt(gibberish);

        /*
        Exception in thread "main" java.lang.NumberFormatException: For input string: "0.05"
            at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            at java.base/java.lang.Integer.parseInt(Integer.java:565)
            at java.base/java.lang.Integer.parseInt(Integer.java:662)
            at Parsing01.main(Parsing01.java:16)
        */
    }
}