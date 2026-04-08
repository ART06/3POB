public class ScopeTest {
    
    public static void main(String[] args) {
        
        for(int a = 64; a >= 1; a = a / 2 ){
            System.out.print(a + " ");
        } 
        
        System.out.println("");
        
        for(int j = 0; j <= 5; j++){
            System.out.print(j + " ");
        }
        
        System.out.println("");
        
        for(int j = 5; j >= 0; j--){
            System.out.print(j + " ");
        }
        
        System.out.println("");
        
        for(int k = 2; k <= 64; k = k * 2){
            System.out.print(k + " ");
        }
        
        System.out.println("");
    }  
}