public class atividade01 {

    public static void main(String[] args) {
        double valorCompra = 320.00;
        double valorDesconto = 0;
        double valorFinal = 0;
        String percentual = "";

        if(valorCompra >= 500){
            percentual = "15%";
            valorDesconto = valorCompra * 0.15;
            valorFinal = valorCompra - valorDesconto;
        }
        else if(valorCompra >= 250){
            percentual = "10%";
            valorDesconto = valorCompra * 0.10;
            valorFinal = valorCompra - valorDesconto;
        }
        else if(valorCompra >= 100){
            percentual = "5%";
            valorDesconto = valorCompra * 0.05;
            valorFinal = valorCompra - valorDesconto;
        }
        else{
            System.out.println("Abaixo de 100$ não tem desconto.");
        }

        System.out.println("===== LOJA DO BAIRRO - CUPOM FISCAL =====");
        System.out.printf("Valor original da compra: R$ %.2f%n", valorCompra);
        System.out.printf("Percentual de desconto: %s%n", percentual);
        System.out.printf("Valor do desconto: R$%.2f%n", valorDesconto);
        System.out.printf("Valor total a pagar: R$%.2f%n", valorFinal);

    }
}
