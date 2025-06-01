package NivelIntermediario.Polimorfismo;

public abstract class Ninja implements EstrategiaDeBatalha{
    String nome;
    String aldeia;
    int idade;

    public Ninja() {
    }

    public Ninja(int idade, String aldeia, String nome) {
        this.idade = idade;
        this.aldeia = aldeia;
        this.nome = nome;
    }

    // Metodo geral! Todos os ninjas vão possuir!
    public void habilidadeEspecial(){
        System.out.println("Meu nome é "+nome+" e esse é meu ataque especial!");
    }


    //Sobreescrevendo o metodo da interface!
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Essa é minha estratégia de combate!");
    }
}
