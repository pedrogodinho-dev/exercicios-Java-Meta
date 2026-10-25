public class Exercicio10 {

    public static void main(String[] args) {
        double a = 23.0;
        double b = 7.0;

        System.out.printf("Número A: %.1f | Número B: %.1f%n", a, b);

        double soma = a + b;
        double subtracao = a - b;
        double multiplicacao = a * b;
        double divisao = a / b;
        double resto = a % b;

        System.out.printf("(1) Adição (a + b)        : %.2f%n", soma);
        System.out.printf("(2) Subtração (a - b)     : %.2f%n", subtracao);
        System.out.printf("(3) Multiplicação (a * b) : %.2f%n", multiplicacao);
        System.out.printf("(4) Divisão Real (a / b)  : %.4f%n", divisao);
        System.out.printf("(5) Resto/Módulo (a %% b)  : %.2f%n", resto);

        System.out.println("\n--- DESAFIO EXTRA ---");
        double quadradoA = a * a;
        double cuboA = a * a * a;
        double mediaAritmetica = (a + b) / 2.0;

        System.out.printf("Quadrado de A (a * a)     : %.2f%n", quadradoA);
        System.out.printf("Cubo de A (a * a * a)     : %.2f%n", cuboA);
        System.out.printf("Média Aritmética          : %.2f%n", mediaAritmetica);

        System.out.println("Valor inicial de 'a': " + a);
        System.out.println("Imprimindo ++a      : " + (++a));
        System.out.println("Valor final de 'a'  : " + a);

        System.out.println();

        System.out.println("Valor inicial de 'b': " + b);
        System.out.println("Imprimindo b--      : " + (b--));
        System.out.println("Valor final de 'b'  : " + b);

        System.out.println("\nExplicação:");
        System.out.println("- No PRÉ-incremento (++a), o Java soma 1.0 à variável ANTES de usar seu valor na impressão.");
        System.out.println("- No PÓS-decremento (b--), o Java usa/imprime o valor ATUAL da variável primeiro e SÓ DEPOIS subtrai 1.0.");

    }
}