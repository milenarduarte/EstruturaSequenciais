package estrutura_sequencial;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int numero_funcionario;
        double h_trabalhadas, valor_hora, salario;

        System.out.print("Digite o número do funcionário: ");
        numero_funcionario = sc.nextInt();
        System.out.print("Digite o número de horas trabalhadas: ");
        h_trabalhadas = sc.nextDouble();
        System.out.print("Digite o valor recebido por hora: ");
        valor_hora = sc.nextDouble();

        salario = h_trabalhadas * valor_hora;
        
        System.out.printf("Número = %d%nSálário = R$ %.2f", numero_funcionario, salario);
        
        sc.close();
    }
}
