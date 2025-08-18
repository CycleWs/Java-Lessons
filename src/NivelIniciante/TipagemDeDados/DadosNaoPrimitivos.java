package NivelIniciante.TipagemDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*todo
            Dados NÃO primirivos: String, Array, Class, enum
            -
            Em Java, os dados não primitivos são tipos de dados que não são simples ou primitivos, como int, char,
            boolean, etc.
            -
            Eles incluem classes, arrays e strings. Esses tipos de dados são mais complexos e podem conter múltiplos
            valores ou comportamentos.
            -
            Por exemplo, uma String é uma sequência de caracteres, um Array é uma coleção de elementos do mesmo tipo, e
            Classes são estruturas que definem objetos com propriedades e métodos.
            -
            Os dados não primitivos são referenciados por ponteiros, enquanto os primitivos são armazenados diretamente
            na memória.
         */

        String nome = "Naruto Uzumaki";
        String nomeEmCaixaAlta = nome.toUpperCase();
        System.out.println("Nome normal: "+nome);
        System.out.println("Nome em CapsLock: "+ nomeEmCaixaAlta);
    }
}
