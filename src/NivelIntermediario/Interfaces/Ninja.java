package NivelIntermediario.Interfaces;

public class Ninja {

    String nomeNinja;
    String aldeia;
    int idade;
    String missao;
    String statusMissao;

    public void mostrarInfos(){
        System.out.println("Meu nome é " + nomeNinja + " eu tenho " +idade + " anos e " +missao + "E no momento estou " +statusMissao);
    }



}