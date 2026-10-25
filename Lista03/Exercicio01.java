import java.util.Scanner;
public class Exercicio01 {

    public static void main(String[] args) {
        double somaNotas = 0;
        double maiorNota = 0;
        double menorNota = 10;
        String situacao = "";

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.println("Nome do aluno: " + nome);
        for(int i = 1; i <= 4; i++){
            System.out.printf("Digite a nota do %d bimestre%n", i);
            double nota = teclado.nextDouble();
            somaNotas += nota;
            System.out.printf("Digite a nota do %d bimestre: %.2f %n", i, nota);
            if(i == 1){
                maiorNota = nota;
                menorNota = nota;
            }else{
                if(nota >= maiorNota){
                maiorNota = nota;
                }if(nota <= menorNota){
                menorNota = nota;
                }
            }
        }
        double media = somaNotas /4;
        if(media >= 7.0){
            situacao = "APROVADO!";
        }else if(media >= 5.0){
            situacao = "RECUPERAÇÃO!";
        }else{
            situacao = "REPROVADO!";
        }
        System.out.println("===== BOLETIM ESCOLAR - META =====");
        System.out.printf("Aluno: %s\n" +
            "Soma das notas: %.1f\n" +
            "Maior nota: %.1f\n" +
            "Menor nota: %.1f\n" +
            "Media final: %.2f\n" +
            "Situacao: %s\n", nome, somaNotas, maiorNota, menorNota, media, situacao);
        teclado.close();

    }
}