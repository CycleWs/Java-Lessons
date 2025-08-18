package NivelIniciante.lacosRepeticao;

public class LacosDeRepeticoes {
    public static void main(String[] args) {

        /* todo
            Laços de Repetição - Estruturas de Repetição
            -   Os laços de repetição são estruturas que permitem executar um bloco de código várias vezes, enquanto uma condição for verdadeira
            -   Existem três tipos principais de laços em Java: while, do-while e for.
            -   A estrutura while executa o bloco de código enquanto a condição for verdadeira. A condição é verificada antes da execução do bloco.
            -   A estrutura do-while executa o bloco de código pelo menos uma vez, pois a condição é verificada após a execução do bloco.
            -   A estrutura for é usada quando você sabe quantas vezes deseja repetir um bloco de código, geralmente com um contador.
         */

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        //todo While
        while (numeroDeClones <= numeroMaximoDeClones){
            numeroDeClones++;
            System.out.println("O naruto fez "+ numeroDeClones +" Clones");
        }

        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");



        //todo For
        for (int nivelDeChakra = 0; nivelDeChakra <= 100 ; nivelDeChakra++) {

            System.out.println("Carregando Chakra - Chakra em "+nivelDeChakra+"%");


        }
        
    }
}
