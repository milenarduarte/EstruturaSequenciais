import java.util.Scanner;
import java.util.ArrayList;

public class calculo_medias {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Double> listaMedias = new ArrayList<Double>();
            ArrayList<String> listaNomes = new ArrayList<String>();

            String aluno;
            int num_alunos;
            double nota1, nota2, nota3, media_individual, media_geral, soma;

            // Codigo
            System.out.print("Digite o número de alunos da turma: ");
            num_alunos = sc.nextInt();

            for (int i = 0; i <= num_alunos; i++) {
                System.out.print("Digite o nome do aluno: ");
                aluno = sc.nextLine();
                listaNomes.add(aluno);
            }
            for (int j = 0; j <= 3; j++) {
                System.out.printf("Digite as 3 notas do aluno" + aluno);
                nota1 = sc.nextDouble();
                nota2 = sc.nextDouble();
                nota3 = sc.nextDouble();

                // calcular média individual
                media_individual = (nota1 + nota2 + nota3) / 3;
                listaMedias.add(media_individual);
            }
            

            for (String nome : listaNomes) {
                System.out.print("Aluno: ");
                System.out.println(nome);
            }
            for (Double media1 : listaMedias) {
                System.out.print("Média: ");
                System.out.println(media1);
            }

            soma = 0.0;
            for (Double media : listaMedias) {
                media_geral = soma += media;
                System.out.println("Média geral da turma: " + media_geral);
            }
        }      
    }
}