public class atividade06 {

    public static void main(String[] args) {
        // ====== DECLARE AS 9 VARIÃVEIS ABAIXO ======
        byte idade;
        short anoConclusaoEM;
        int numeroInscricao;
        long cpf;
        float notaPrimeiraFase;
        double mediaFinalPonderada;
        char turno;
        boolean necessidadeEspecial;
        String nomeCandidato;

        // ====== ATRIBUA VALORES E IMPRIMA A FICHA ======
        idade = 17;
        anoConclusaoEM = 2025;
        numeroInscricao = 48291;
        cpf = 12345678901L;
        notaPrimeiraFase = 74.25F;
        mediaFinalPonderada = 82.47;
        turno = 'M';
        necessidadeEspecial = false;
        nomeCandidato = "Luiza Fernandes";


        System.out.printf("%-20s: %s%n", "Nome do Candidato", nomeCandidato);
        System.out.printf("%-20s: %d%n", "Nº de Inscrição", numeroInscricao);
        System.out.printf("%-20s: %d%n", "CPF", cpf);
        System.out.printf("%-20s: %d anos%n", "Idade", idade);
        System.out.printf("%-20s: %d%n", "Ano Conclusão E.M.", anoConclusaoEM);
        System.out.printf("%-20s: %c%n", "Turno", turno);
        System.out.printf("%-20s: %.2f%n", "Nota 1ª Fase", notaPrimeiraFase);
        System.out.printf("%-20s: %.2f%n", "Média Final Ponderada", mediaFinalPonderada);
        System.out.printf("%-20s: %b%n", "Necessidade Especial", necessidadeEspecial);
    }
}
