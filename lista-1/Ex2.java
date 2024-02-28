import java.util.Scanner;

public class Ex2 {
    
    public static void main(String [] args) {
        Scanner in;
        in = new Scanner(System.in);

        double numero;
        System.out.println("digite um número");
        numero = in.nextDouble();

        double porcentagem;
        porcentagem = numero * 0.2;

        System.out.println("20% acrescentados:" + (numero + porcentagem));
    }

}
