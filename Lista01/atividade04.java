public class atividade04 {

    public static void main(String[] args) {
        String nomePaciente = "Ana Clara Rocha";
        int idade = 22;
        double peso = 72.5;
        double altura = 1.78;

        // ====== ESCREVA SUA SOLUÃ‡ÃƒO ABAIXO ======
        double imc; 
        imc = peso / (altura * altura);
        String classificacao;

        if (imc >= 40){
            classificacao = "Obesidade Grau III";
        }else if (imc >= 35){
            classificacao = "Obesidade Grau II";
        }else if (imc >= 30){
            classificacao = "Obesidade Grau I";
        }else if (imc >= 25){
            classificacao = "Sobrepeso";
        }else if(imc >= 18.5){
            classificacao = "Peso normal";
        }else{
            classificacao = "Abaixo do peso";
        }

        System.out.println("Paciente: " + nomePaciente + " (" + idade + " anos)");
        System.out.printf("IMC: %.2f%n", imc);
        System.out.println("Classificação: " + classificacao);
        
    }
}

