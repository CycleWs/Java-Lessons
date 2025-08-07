package NivelIntermediario.ArrayNLists;

import java.util.ArrayList;
import java.util.List;

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

        System.out.println("Ninjas: "+ ninjasList);
        System.out.println("---------------------------------");

        //Remover da lista
        ninjasList.remove("Sakura Haruno");
        System.out.println("Ninjas: "+ ninjasList);
        System.out.println("---------------------------------");

        //Trocar da lista
        ninjasList.set(0,"Hashirama Senju");
        System.out.println("Ninjas: "+ ninjasList);
        System.out.println("---------------------------------");

        //Ver tamanho da lista
        System.out.println(ninjasList.size());

    }
}
