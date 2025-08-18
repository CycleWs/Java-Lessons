package NivelIniciante.EstruturaDeDadosBasico;

public class Arrays {
    public static void main(String[] args) {
        /*todo
            Arrays
            -
            Um array em Java é uma estrutura de dados que permite armazenar vários elementos de um mesmo tipo em uma
            única variável. Os arrays são úteis quando precisamos trabalhar com coleções de dados que têm o mesmo tipo,
            como uma lista de números inteiros ou uma sequência de strings.
            -
            -
            Ao trabalhar com arrays em Java, é importante entender o comportamento dos objetos de memória e a
            inicialização padrão de seus elementos. Quando um array é criado, seus valores são automaticamente
            inicializados de acordo com o tipo de dado que ele armazena. Para tipos primitivos como int, double ou
            boolean, os valores padrão são 0, 0.0 e false, respectivamente. Já para objetos como String ou outros
            tipos de referência, o valor padrão é null.
         */

        String[] ninja = new String[3]; // de 0 a 2
        ninja[0] = "Naruto";
        ninja[1] = "Sasuke";
        ninja[2] = "Sakura";

        System.out.println("Ultimo ninja inserido: "+ ninja[2]);

        System.out.println("-----------------------------------");

        System.out.println("Todos os ninjas: ");
        for (int i = 0; i < ninja.length; i++) {
            System.out.println(ninja[i]);

        }



    }
}
