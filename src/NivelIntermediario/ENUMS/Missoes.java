package NivelIntermediario.ENUMS;

public class Missoes {

    private String nome;
    private RankDeMissoes rank;


    //Metodo para mostrar mais infos!

    public void exibirDetalhes(){
        System.out.println("Missão: "+ nome + " Rank: "+ rank);
        System.out.println("Desc: "+ rank.getDescricao()+ " Dificuldade: "+rank.getDificuldade());
    }

    public Missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankDeMissoes getRank() {
        return rank;
    }

    public void setRank(RankDeMissoes rank) {
        this.rank = rank;
    }
}
