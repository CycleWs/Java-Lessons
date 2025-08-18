package NivelIniciante.condicoes;

public class IfnElse {

    public static void main(String[] args) {
        /*todo
            IF & Else - Condições
            -
            O if e else são estruturas de decisão em Java. 
            O if executa um bloco de código se uma condição for verdadeira. 
            O else permite executar outro bloco caso a condição seja falsa. 
            Também é possível usar else if para testar múltiplas condições
     */

        String nome = "Naruto Uzumaki";
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 4;
        String rank;

        if(numeroDeMissoes > 10){
            System.out.println("Pronto para passar de nivel");
            rank = "Gennin";
            System.out.println("rank: "+ rank);
        } else if (numeroDeMissoes == 0) {
            System.out.println("Nenhuma missão completa ainda!");
        } else{
            System.out.println("Não está pronto ainda para passar de nivel!");
        }
    }



}
