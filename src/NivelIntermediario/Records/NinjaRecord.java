package NivelIntermediario.Records;

public record NinjaRecord(String nomeRecord, String emailRecord, int telefoneRecord) {


    public String emailCaixaAlta(){
        return emailRecord.toUpperCase();
    }

    //todo É EXATAMENTE IGUAL À CONSTRUÇÃO DE OBJETOS USADO NA CLASS "NoRecord"
    //todo PORÉM, NÃO EXISTEM SETTERS EM Record's !
    //todo GETTERS SÃO CRIADOS AUTOMATICAMENTE PORÉM SEM O PRE-FIXO "get"


    //todo Principais Conceitos sobre Record:

    //todo Imutabilidade: Os objetos de um record são imutáveis por padrão, ou seja, os valores dos campos não podem ser
    // alterados após a criação do objeto.

    //todo Declaração Simplificada: Com record, você pode declarar uma classe contendo apenas os campos que deseja
    // armazenar, e o compilador automaticamente gera os métodos getter, toString(), hashCode(), e equals().

    //todo Uso: Ideal para classes que são puramente contêineres de dados. Por exemplo, você pode usar um record para
    // representar um Ninja com os campos nome, idade, e vila.

    //todo Exemplo no Contexto de Naruto: Imagine um record chamado Ninja, que armazena as informações de um personagem
    // de Naruto: String nome, int idade, e String vila. Esse record pode ser usado para representar facilmente
    // personagens como Naruto, Sasuke e Kakashi de forma concisa e imutável.

}
