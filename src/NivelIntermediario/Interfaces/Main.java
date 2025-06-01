package NivelIntermediario.Interfaces;

public class Main {
    public static void main(String[] args) {

        // Criar o ninja Naruto - Naruto é um OBJETO
        Uzumaki Naruto = new Uzumaki();
        Naruto.nomeNinja = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 17;
        Naruto.modoSabioAtivado();

        // Criar ninja Sasuke Uchiha - Sasuke é um objeto
        Uchiha Sasuke = new Uchiha();
        Sasuke.nomeNinja = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 18;
        Sasuke.missao = "Matar todos da minha familia";
        Sasuke.statusMissao = "Incompleta";
        Sasuke.habilidadeEspecial = "SHARIGAN e Chidori";

        Sasuke.mostrarInfos();

        // Criar Sakura Haruno
        Haruno Sakura = new Haruno();
        Sakura.nomeNinja = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 18;
        Sakura.ativarCura();

        Hyuga Hinata = new Hyuga();
        Hinata.nomeNinja = "Hinata Hyuga";
        Hinata.aldeia = "Aldeia da Folha";
        Hinata.idade = 17;
        Hinata.ByakuganAtivado();

        Boruto Boruto = new Boruto();
        Boruto.nomeNinja = "Boruto Hyuga Uzumaki";
        Boruto.aldeia = "Aldeia da Folha";
        Boruto.idade = 9;

        Boruto.modoSabioAtivado();
        Boruto.AtivarJougan();
        Boruto.AtivarOKarma();


    }
}
