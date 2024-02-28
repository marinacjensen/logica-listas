import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner in;
        in = new Scanner(System.in);

        int numero;
        System.out.println("digite um número");
        numero = in.nextInt();

        System.out.println("Antecessor:" + (numero - 1));
    }


}