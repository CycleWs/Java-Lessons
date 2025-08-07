package NivelIntermediario.Genericos.SemGenerics;

public class MaIn {
    public static void main(String[] args) {

        Kunai kunai1 = new Kunai("Kunai");
        Kunai kunai2 = new Kunai("Kunai explosiva");
        Kunai kunai3 = new Kunai("Kunai de fogo");

        BolsaEquipamentos bolsaEquipamentos = new BolsaEquipamentos();
        bolsaEquipamentos.adcionarEquipamentos(kunai1);
    }
}
