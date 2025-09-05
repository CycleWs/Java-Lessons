package NivelIntermediario.HerancasMultiplas;

public class Hatake extends Ninja implements SharinganInterface,AnbuInterface{

    @Override
    public void ninjaDeElite() {
        System.out.println(nome+": Eu sou um ninja de Elite da ANBU!");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println("meu nome é "+ nome+" e eu ativei o sharingan");
    }

    public void boasVindas(){
        System.out.println(nome + ": Eu sou um Hatake!");
    }
}
