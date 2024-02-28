import java.util.Scanner;

public class Ex5 {
    public static void main (String[] args) {
        
        Scanner in;
        in = new Scanner(System.in);
        double frht, celsius;

        System.out.println("Digite uma temperatura em Fahrenheit");
        frht = in.nextDouble();

        celsius = (frht - 32)/9 * 5;

        System.out.println(frht + "F = " + celsius + "C");
    }
}
