package binario;

import static binario.bin1.buscar;
import java.util.Scanner;

public class Binario {

    public static void main(String[] args) {
        int b;
        Scanner a = new Scanner(System.in);
        System.out.println("Digite un numero de base 10: ");
        b = a.nextInt();
        System.out.println(" El numero binario es: ");
        System.out.println(buscar(b));
    }
}
