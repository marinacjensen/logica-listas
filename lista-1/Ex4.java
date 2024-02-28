import java.util.Scanner;

public class Ex4 {
    
    public static void main (String[] args) {
        
        Scanner in;
        in = new Scanner(System.in);

        double base, altura, area;
        System.out.println("digite a base e a altura de um triangulo:");
        base = in.nextDouble();
        altura = in.nextDouble();

        area = (base*altura)/2;
        System.out.println("Resultado: " + area);
    }

}
