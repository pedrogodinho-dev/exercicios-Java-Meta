import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int quantidadeItens = 0;
        double totalCompra = 0;
        double maiorPreco = 0;

        System.out.println("Digite o preço do item(ou 0 para encerrar): ");
        double preco = teclado.nextDouble();

        while(preco != 0){
            if(preco < 0){
                System.out.println("Preço invalido! Valor ignorado.");
            }else{
                quantidadeItens++;
                totalCompra += preco;
                if(preco >= maiorPreco){
                    maiorPreco = preco;
                }
                System.out.printf("Item registrado: %.2f%n", preco);
            }
            System.out.println("Digite o próximo preço (ou 0 para encerrar): ");
            preco = teclado.nextDouble();
        }
        if(quantidadeItens == 0){
            System.out.println("Nenhum item registrado. Caixa fechado.");

        }else{
            double precoMedio = totalCompra / quantidadeItens;

            System.out.printf("Quantidade de itens: %d%n" +
                "Total da compra: %.2f%n" +
                "Item mais caro: %.2f%n" +
                "Preço medio por item: %.2f%n", quantidadeItens, totalCompra, maiorPreco, precoMedio);
        }
        teclado.close();
    }
}