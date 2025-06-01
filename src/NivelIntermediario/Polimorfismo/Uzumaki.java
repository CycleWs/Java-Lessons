package NivelIntermediario.Polimorfismo;

public class Uzumaki extends Ninja{


    public Uzumaki() {
        super();
    }

    public Uzumaki(int idade, String aldeia, String nome) {
        super(idade, aldeia, nome);
    }

    //Sobreescrevendo da classe Ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é "+nome+" e esse é meu ataque Uzumaki, um ataque de ar!");

    }
}
