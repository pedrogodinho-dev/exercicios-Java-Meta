public class atividade05 {
    public static void main(String[]args){
        String nome = "Joao Pedro Silva";
        String cargo = "Assistente Administrativo";
        int horasMes = 176;
        double valorHora = 32.50;
        double valeRefeicao = 450;

        double salarioBruto;
        salarioBruto = horasMes * valorHora;
        double INSS;
        INSS = salarioBruto * 0.08;
        double IRRF;
        IRRF = salarioBruto * 0.12;
        double salarioLiquido;
        salarioLiquido = salarioBruto - INSS - IRRF + valeRefeicao;

        System.out.printf("Funcionario: %s%n", nome);
        System.out.printf("Cargo: %s%n", cargo);
        System.out.printf("Horas no mes: %d%n", horasMes);
        System.out.printf("Valor da hora: %.2f%n", valorHora);


        System.out.printf("Salario bruto: %.2f%n", salarioBruto);
        System.out.printf("INSS: %.2f%n", INSS);
        System.out.printf("IRRF: %.2f%n", IRRF);
        System.out.printf("Refeição: %.2f%n", valeRefeicao);


        System.out.printf("Salario liquido: R$%.2f", salarioLiquido);
    }
}
