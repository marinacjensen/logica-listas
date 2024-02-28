import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args) {
        
        Scanner in;
        in = new Scanner(System.in);

        int numero;
        System.out.println("digite um numero:");
        numero = in.nextInt();

        System.out.println("Resultado: " + (numero * numero));
    }

}
