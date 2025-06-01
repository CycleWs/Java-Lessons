package NivelIntermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {


        //Obj Naruto
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 16;
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        //Obj Sasuke
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uzumaki";
        sasuke.idade = 17;
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();

        Uchiha itachi = new Uchiha(27,"Folha","Itachi Uchiha");
        itachi.habilidadeEspecial();
    }
}
