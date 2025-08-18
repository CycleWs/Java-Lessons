package NivelIniciante.TipagemDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        /*todo
            Dados Primitivos - int, double, float, char, boolean, short;
            -
            Em Java, os dados primitivos são os tipos de dados básicos que não são objetos. Eles incluem tipos como int
            (inteiros), double (números de ponto flutuante), char (caracteres), boolean (verdadeiro ou falso) e short
            (números inteiros menores).
            -
            Esses tipos de dados são usados para armazenar valores simples e são mais eficientes em termos de memória e
            desempenho.
            -
            Os dados primitivos são armazenados diretamente na memória, enquanto os dados não primitivos (como Strings e
            Arrays) são armazenados como referências a objetos.
            -
            Cada tipo primitivo tem um tamanho fixo em bytes, o que determina o intervalo de valores que pode ser armazenado.

        */

        int idade = 22;//todo Valor Maximo suportado por int: Intervalo de -2.147.483.649 até 2.147.483.647 (APENAS INTEIROS)
        double altura = 1.75;
        char inicialDoNome = 'H';
        boolean vivoOuMorto = true;
        short tarefasDiarias = 6;//todo Valor máximo suportado por shorts: Intervalo de -32.768 a 32.767
        Long saldoBancario = 999999L; //todo valor máximo suportado por Longs: 9.233.372.036.854.775.807

        System.out.println(idade);
        System.out.println(saldoBancario);
        System.out.println(altura);
        System.out.println("Saldo bancário é: " + saldoBancario);
        System.out.println("Minha idade é: "+ idade);

    }
}
