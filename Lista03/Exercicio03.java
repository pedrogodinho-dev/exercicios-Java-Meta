import java.util.Scanner;
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pinCorreto = 1234;
        int maxTentativas = 3;
        int tentativas = 0;
        int pinDigitado;

        do {
            System.out.println("Digite seu PIN: ");
            pinDigitado = teclado.nextInt();
            tentativas ++;
        } while (pinDigitado != pinCorreto && tentativas < maxTentativas);
        if(pinDigitado == pinCorreto){
            System.out.println("ACESSO LIBERADO! Bem vindo(a).");
            System.out.printf("Tentativas utilizadas: %d%n", tentativas);
        }else{
            System.out.println("CARTÃO BLOQUEADO! Procure sua agencia.");
        }
        System.out.println("===== BANCO META - CAIXA ELETRONICO =====");
        teclado.close();
    }
}
