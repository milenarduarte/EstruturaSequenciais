package anotacoes;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // declaração de variáveis
        int y = 32;
        double x = 10.35784;

        // prints
        System.out.println(y);
        System.out.println(x);
        System.out.println("Olá Mundo!");

        // printf = imprimir formatado
        // escolher numero de casas decimais para printar
        // %n = quebra de linha
        // %.2f = padrão de máscara de formatação para delimitar casas decimais
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US); // mudar o padrão de separador decimal para "."
        System.out.printf("%.4f%n", x);

        /*
         * %f = ponto flutuante
         * %d = inteiro
         * %s = texto
         * %n = quebra de linha
         */

        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f metros%n", x);

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    
        
    
    
    
    
    
    }
}