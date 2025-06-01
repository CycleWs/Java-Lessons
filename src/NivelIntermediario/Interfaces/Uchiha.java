package NivelIntermediario.Interfaces;

public class Uchiha extends Ninja{

    String habilidadeEspecial;


    public void mostrarHabilidadeEspecial(){
        System.out.println("Minha habilidade especial é: " + habilidadeEspecial);
    }

    @Override
    public void mostrarInfos() {
        System.out.println("Meu nome é " + nomeNinja + " eu tenho " +idade + " anos e " +missao + "E no momento estou " +statusMissao + " e minha habilidade especial é " + habilidadeEspecial);
    }
}
