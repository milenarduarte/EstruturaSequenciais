package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
           
        double A, B, C, triangulo_ret, circulo, trapezio, quadrado, retangulo;

        System.out.println("Digite três números: ");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangulo_ret = (A * C) / 2;
        circulo = 3.14159 * Math.pow(C, 2);
        trapezio = ((A + B) * C) / 2;
        quadrado = Math.pow(B, 2);
        retangulo = A * B;

        System.out.printf("Triângulo: %.3f%n", triangulo_ret);
        System.out.printf("Círculo: %.3f%n", circulo);
        System.out.printf("Trapézio: %.3f%n", trapezio);
        System.out.printf("Quadrado: %.3f%n", quadrado);
        System.out.printf("Retângulo: %.3f%n", retangulo);

        sc.close();
    }
}