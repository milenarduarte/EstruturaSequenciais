package estrutura_sequencial;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
           
        int codigo1, codigo2, num_pecas1, num_pecas2;
        double valor1, valor2, pagar;

        System.out.println("PEÇA 1");
        System.out.print("Código: ");
        codigo1 = sc.nextInt();
        System.out.print("Número de peças: ");
        num_pecas1 = sc.nextInt();
        System.out.print("Valor unitário: ");
        valor1 = sc.nextDouble();

        System.out.println("");

        System.out.println("PEÇA 2");
        System.out.print("Código: ");
        codigo2 = sc.nextInt();
        System.out.print("Número de peças: ");
        num_pecas2 = sc.nextInt();
        System.out.print("Valor: ");
        valor2 = sc.nextDouble();

        pagar = (num_pecas1 * valor1) + (num_pecas2 * valor2);

        System.out.printf("Valor a pagar: R$" + pagar);
        sc.close();
    }
}
