package NivelIntermediario.Polimorfismo;

public class Uchiha extends Ninja{


    public Uchiha(){
        super();
    }

    public Uchiha(int idade, String aldeia, String nome) {
        super(idade, aldeia, nome);
    }

    //Sobreescrevendo da classe Ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é "+nome+" e esse é meu ataque Uchiha, um ataque de fogo!");

    }
}
