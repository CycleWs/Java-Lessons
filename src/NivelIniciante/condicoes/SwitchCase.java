package NivelIniciante.condicoes;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        /* todo
            Switch Case - Estrutura de Decisão
            -
            O switch case é uma estrutura de controle que permite selecionar uma ação com base no valor de uma variável.
            É útil quando você tem várias condições para verificar um único valor.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        int escolhaDoUsuario = scanner.nextInt();

        switch (escolhaDoUsuario){
            case 1:
                System.out.println("Usuario escolheu o Naruto Uzumaki!");
                break;

            case 2:
                System.out.println("Usuario escolheu o Sasuke Uchiha!");
                break;
            case 3:

                System.out.println("Usuario escolheu o Sakura Haruno!");
                break;

            default:
                return;
        }

        scanner.close();
    }
}
