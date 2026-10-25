import java.util.Scanner;
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        int totalConversoes = 0;
        do { 
            System.out.println("====== CONVERSOR DE TEMPERATURA ======");
            System.out.println("1 - Celsius -> Fahrenheit" +
                                "2 - Fahrenheit -> Celsius" +
                                "3 - Celsius -> Kelvin" +
                                "0 - Sair" +
                                "Escolha uma opcao: ");
            opcao = teclado.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Digite a temperatura do celsius: ");
                    double c1 = teclado.nextDouble();
                    double f1 = c1 * 9.0 / 5 + 32;
                    System.out.printf("%.1f C = %.1f F\n", c1, f1);
                    totalConversoes ++;
                    break;

                case 2:
                    System.out.println("Digite a temperatura do fahrenheit: ");
                    double f2 = teclado.nextDouble();
                    double c2 = (f2 - 32) * 0.5 / 9;
                    System.out.printf("%.1f F = %.1f C\n", f2, c2);
                    totalConversoes ++;
                    break;
                case 3:
                    System.out.println("Digite a temperatura do celsius");
                    double c3 = teclado.nextDouble();
                    double k3 = c3 + 273.15;
                    System.out.printf("%.1f C = %.1f K\n", c3, k3);
                    totalConversoes ++;
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção invalida! Escolha entre 1, 2 ou 3");
                    break;
            }
        } while (opcao != 0);
        System.out.println("Total de conversões realizadas: " + totalConversoes);

        teclado.close();
    }
}
