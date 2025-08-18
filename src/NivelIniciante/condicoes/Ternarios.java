package NivelIniciante.condicoes;

public class Ternarios {
    public static void main(String[] args) {

        /*todo
           Ternários
           -
            O operador ternário é uma forma simplificada de escrever uma condição if-else em uma única linha.
            Sua estrutura é: condição ? valorSeVerdadeiro : valorSeFalso.
            Ele avalia a condição e retorna um valor se for verdadeira, ou outro valor se for falsa
         */

        short numeroDeMissoes = 11;

                        //todo condição ----------------   Se for verdadeiro v   --------------------    se for falso v
        String nivel = (numeroDeMissoes >= 10)? "Este ninja está com mais de 10 missões" : "Este ninja tem menos de 10 missões";
    //todo  Numero de missões é igual ou maior que 10?

        System.out.println(nivel);

    }
}
