package NivelIntermediario.Encapsulamento;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------NARUTO UZUMAKI-------");
        Uzumaki naruto = new Uzumaki("Naruto","Folha",18,39,1.80);
        System.out.println(naruto.getNome());
        naruto.setNome("Naruto Uzumaki");
        System.out.println(naruto.getNome());

        System.out.println("-------SASUKE UCHIHA-------");
    }
}
