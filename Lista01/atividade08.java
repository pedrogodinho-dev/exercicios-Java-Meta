public class atividade08 {

    public static void main(String[] args) {
        double valorCompra = 78.50;
        double valorPago = 100.00;

        // ====== ESCREVA SUA SOLUÃ‡ÃƒO ABAIXO ======
        // Passo 1: calcule o troco como double.
        double troco = valorPago - valorCompra;
        // Passo 2: arredonde para int (use (int) Math.round(troco)
        //          ou simplesmente (int)(troco + 0.001) para evitar
        //          erros de ponto flutuante).
        int trocoInteiro = (int) troco;
        // Passo 3: decomponha na ordem: 200 100 50 20 10 5 2.
        int notas200 = trocoInteiro / 200;
        trocoInteiro = trocoInteiro % 200;

        int notas100 = trocoInteiro / 100;
        trocoInteiro = trocoInteiro % 100;

        int notas50 = trocoInteiro / 50;
        trocoInteiro = trocoInteiro % 50;

        int notas20 = trocoInteiro / 20;
        trocoInteiro = trocoInteiro % 20;

        int notas10 = trocoInteiro / 10;
        trocoInteiro = trocoInteiro % 10;

        int notas5 = trocoInteiro / 5;
        trocoInteiro = trocoInteiro % 5;

        int notas2 = trocoInteiro / 2;
        trocoInteiro = trocoInteiro % 2;

        // Exibição das quantidades de notas
        System.out.printf("Qtde notas de R$ 200 = %d%n", notas200);
        System.out.printf("Qtde notas de R$ 100 = %d%n", notas100);
        System.out.printf("Qtde notas de R$  50 = %d%n", notas50);
        System.out.printf("Qtde notas de R$  20 = %d%n", notas20);
        System.out.printf("Qtde notas de R$  10 = %d%n", notas10);
        System.out.printf("Qtde notas de R$   5 = %d%n", notas5);
        System.out.printf("Qtde notas de R$   2 = %d%n", notas2);

        // Passo 4: some as quantidades e imprima o total de notas.
        int totalNotas = notas200 + notas100 + notas50 + notas20 + notas10 + notas5 + notas2;

        System.out.println("-----------------------------");
        System.out.println("Total de notas entregues: " + totalNotas);

    }
}
