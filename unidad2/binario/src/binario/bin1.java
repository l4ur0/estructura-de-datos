
package binario;

public class bin1 {
    public static int buscar(int a){
        
        if(a==0){
            return 0;   
        }else{
            return (a %2 + 10 * buscar(a/2));
        }
    }
}