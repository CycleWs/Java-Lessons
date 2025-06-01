package NivelIntermediario.Construtores;

public abstract class Hokages{
    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    int missoes;

    public abstract void sabedoriaHokage();

    public Hokages(String nome, int idade, boolean vivoOuNao, String aldeia, int missoes) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.aldeia = aldeia;
        this.missoes = missoes;
    }

    public Hokages() {
    }
}
