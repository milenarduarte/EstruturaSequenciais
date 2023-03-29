package estrutura_sequencial;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int A, B, C, D, formula;

        System.out.println("Digite quatro números inteiros: ");
        A = sc.nextInt();
        B  = sc.nextInt();
        C  = sc.nextInt();
        D  = sc.nextInt();

        formula = (A*B) - (C*D);
        System.out.printf("Diferença = " + formula);

        sc.close();
    }
}