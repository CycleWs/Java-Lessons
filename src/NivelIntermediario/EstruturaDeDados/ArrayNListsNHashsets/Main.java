package NivelIntermediario.EstruturaDeDados.ArrayNListsNHashsets;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Array
        //todo SÃO ESTÁTICOS, NÃO ALTERAM DE TAMANHO!!!
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sakura";
        ninjasArray[2] = "Sasuke";

        for (int i = 0; i < ninjasArray.length; i++){
            System.out.println(ninjasArray[i]);
        }

        System.out.println("---------------------------------");

        //LISTAS
        //todo NÃO SÃO ESTÁTICAS, ELAS PODEM AUMENTAR E DIMINUIR!!!

        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Minato Namikazi");
        ninjasList.add("Kakashi Hatake");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Minato Namikazi");
        ninjasList.add("A");
        ninjasList.add("B");
        ninjasList.add("C");
        ninjasList.add("D");
        ninjasList.add("1");
        ninjasList.add("2");
        ninjasList.add("3");

        System.out.println("Ninjas: "+ ninjasList);
        System.out.println("---------------------------------");

        //Remover da lista
        ninjasList.remove("Sakura Haruno");
        System.out.println("Ninjas: "+ ninjasList);
        System.out.println("---------------------------------");

        //Trocar da lista
        ninjasList.set(0,"Hashirama Senju");
        System.out.println("Ninjas: "+ ninjasList);
        System.out.println("V <- Tamanho da lista");

        //Ver tamanho da lista
        System.out.println(ninjasList.size());

        System.out.println("------------------------------------------------------------");



        Set<String> ninjaSet = new HashSet<>();

        ninjaSet.add("Naruto Uzumaki");
        ninjaSet.add("Sasuke Uchiha");
        ninjaSet.add("Sakura Haruno");
        ninjaSet.add("Naruto Uzumaki");

        System.out.println("Lista de ninjas em HashSet não duplicados: "+ninjaSet);
        //todo ITEMS DUPLICADOS SERÃO IGNORADOS!
        //todo ORDEM NÃO RESPEITANDO ADÇÃO NEM ALFABÉTICA!

        System.out.println("------------------------------------------------------------");

        Set<String> ninjasNaoRepetidos = new HashSet<>();

        //todo Usando uma lista com valores repetidos para retirar os nomes repetidos

        System.out.println("ANTES (arrayList)");
        System.out.println(ninjasList);

        ninjasNaoRepetidos.addAll(ninjasList);

        System.out.println("DEPOIS (HashSet)");
        System.out.println(ninjasNaoRepetidos);

        System.out.println("------------------------------------------------------------");

        System.out.println("ANTES DE ORDENAR");
        System.out.println(ninjasNaoRepetidos);

        //todo USANDO TreeSet PARA ORDERNAR ALFABETICAMENTE E NUMERICAMENTE OS NINJAS!
        Set<String> ninjasOrdenados = new TreeSet<>();
        ninjasOrdenados.addAll(ninjasNaoRepetidos);
        System.out.println("DEPOIS DE ORDENAR!");
        System.out.println(ninjasOrdenados);

    }
}
