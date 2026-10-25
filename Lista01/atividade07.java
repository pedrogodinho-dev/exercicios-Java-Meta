

public class atividade07{
    public static void main(String[]args){
        int visualizacoes = 0;
        System.out.println("Passo 1 -> visualizações: " + visualizacoes);


        visualizacoes++;
        visualizacoes++;
        visualizacoes++;
        System.out.println("Passo 2 -> visualizações: "+visualizacoes);


        visualizacoes += 12;
        System.out.println("Passo 3 -> visualizações: "+visualizacoes);


        visualizacoes --;
        System.out.println("Passo 4 -> visualizações: "+visualizacoes);
        

        visualizacoes *=2;
        System.out.println("Passo 5 -> visualizações: "+visualizacoes);

        
        int curtidas = 0;
        int comentarios = 0;
        int compartilhamentos = 0;
        
        curtidas += 15;
        curtidas ++;

        comentarios += 5;

        compartilhamentos ++;
        compartilhamentos += 2;


        System.out.printf("%-20s : %d%n", "Visualizações", visualizacoes);
        System.out.printf("%-20s : %d%n", "Curtidas", curtidas);
        System.out.printf("%-20s : %d%n", "Comentários", comentarios);
        System.out.printf("%-20s : %d%n", "Compartilhamentos", compartilhamentos);
    }
}