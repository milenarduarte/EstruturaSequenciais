package estrutura_sequencial;
import java.util.Scanner;


public class exercicio2{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        double raio, area;

        System.out.println("Digite o raio do círculo: ");
        raio = sc.nextDouble();
        area = 3.14159 * Math.sqrt(raio);
        System.out.printf("A = %.4f%n", area);

        sc.close();
    }
}