
package cambio;

import java.util.Scanner;

public class Cambio {
    
    public static void main(String[] args) {
        Scanner N;
        N = new Scanner (System.in);
        comparar primero = new comparar();  
        int e,p,c;
        
        System.out.println("Ingrese el efectivo; ");
        e = N.nextInt();
        System.out.println("Precio del producto; ");
        p = N.nextInt();
        c = e - p;
        comparar.cantidad(c);
    }
    
}
