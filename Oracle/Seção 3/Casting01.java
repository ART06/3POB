public class Casting01 {
    public static void main(String[] args) {
        // 1. Declare and initialize a byte with a value of 128
        // byte valorByte = 128;

        // 2. Declare and initialize a short with a value of 128
        short valorShort = 128;
        
        // Create a print statement that casts this short to a byte
        System.out.println("Short 128 casted to byte: " + (byte)valorShort);

        
        // 3. Declare and initialize a byte with a value of 127
        byte valorByte = 127;
        
        // Add 1 to this variable and print it
        valorByte++;
        System.out.println("Soma 1 (127 + 1): " + valorByte);
        
        // Add 1 to this variable again and print it again
        valorByte++;
        System.out.println("Soma 1 novamente: " + valorByte);
    }    
}