public class Exercicio02 {

    public static void main(String[] args) {
        int codigoPedido = 4;
        String nomeLanche = "";
        double precoLanche = 0;


        System.out.println(" *  TABELA DO CARDAPIO:\r\n" + //
            " *      Codigo  |  Lanche               |  Preco R$\r\n" + //
            " *      --------|-----------------------|-----------\r\n" + //
            " *         1    |  Cachorro-Quente      |   8,00\r\n" + //
            " *         2    |  X-Salada             |  14,50\r\n" + //
            " *         3    |  X-Bacon              |  17,00\r\n" + //
            " *         4    |  Hamburguer Simples   |  11,00\r\n" + //
            " *         5    |  Refrigerante Lata    |   5,00\r\n" + //
            " *");
        System.out.println("\"====== LANCHONETE DO ZE ======\"");

        switch (codigoPedido){
            case 1:
                nomeLanche = "Cachorro-Quente";
                precoLanche = 8.00;
                break;
            case 2:
                nomeLanche = "X-Salada";
                precoLanche = 14.50;
                break;
            case 3:
                nomeLanche = "X-Bacon";
                precoLanche = 17.00;
                break;
            case 4:
                nomeLanche = "Hamburguer Simples";
                precoLanche = 11.00;
                break;
            case 5:
                nomeLanche = "Refrigerante Lata";
                precoLanche = 5.00;
                break;
            default:
                System.out.println("Opção invalida");
        }
    System.out.printf("Codigo escolhido: %d%n", codigoPedido);
    System.out.printf("Lanche: %s%n", nomeLanche);
    System.out.printf("Preço unitario: %.2f%n", precoLanche);
    System.out.println("Deseja adicionar batata frita? (sim/nao)");

    }
}
