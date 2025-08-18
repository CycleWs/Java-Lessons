package NivelIniciante.Scanners;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*todo
            SCANNER = É um jeito de trazer o usuário para dentro da aplicação
            -
            O Scanner é uma classe em Java que permite ler a entrada do usuário pelo teclado.
            Ele é frequentemente usado para capturar dados do console, como strings, números inteiros e outros tipos de
            dados.
            -
            A classe Scanner oferece métodos para ler diferentes tipos de dados, como nextLine() para strings, nextInt()
            para inteiros, etc.-
            É importante fechar o Scanner após o uso para liberar recursos.
         */


        Scanner caixaDeTexto = new Scanner(System.in); //todo Método de pedir que o usuario use o input do console para passar dados

        System.out.println("Escreva aqui o nome do seu ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do seu ninja é: "+ nomeDoNinja);

        System.out.println("Escreva aqui a idade do seu ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do seu ninja é: "+ idadeDoNinja);


        //todo Sempre fechar o scanner no final!!!!
        caixaDeTexto.close();

    }
}
