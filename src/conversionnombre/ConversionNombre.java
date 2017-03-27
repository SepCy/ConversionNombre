
package ConversionNombre ;

import java.util.Scanner;


public class ConversionNombre {

    
    public static void main(String[] args) {
       System.out.println("Entrez le nombre à convertir");
       Scanner sc = new Scanner(System.in);
       
        int n = 0;
        int r=0;
        n=sc.nextInt();
        if (n==0){
            System.out.println("La conversion en binaire est: " );
            System.out.println(0);}
        else{
                
            System.out.println("La conversion en binaire est: " );
            System.out.print(1);
        while (n>=2){
        
           
            r=n%2;
            n=n/2;
 
            System.out.print(r);}
            
            
        
        
        
        }
        
        
    }
    
}
