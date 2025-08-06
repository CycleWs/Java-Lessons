package NivelIntermediario.MetodosConstantes;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Folha";
        naruto.idade = 18;
        String classe = naruto.classe;
        naruto.declaracaoNinja();
        System.out.println("Minha classe é: "+ classe);

    }
}
