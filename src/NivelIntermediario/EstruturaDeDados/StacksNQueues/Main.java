package NivelIntermediario.EstruturaDeDados.StacksNQueues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("STACKS");

        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.push("Naruto Uzumaki");

        System.out.println("Ninja Stack: "+ninjaStack);
        ninjaStack.push("Sasuke Uchiha");

        System.out.println("Ninja Stack: "+ninjaStack);

        ninjaStack.push("Sakura Haruno");

        System.out.println("Ninja Stack: "+ninjaStack);
        ninjaStack.pop();
        System.out.println("Ninja Stack: "+ninjaStack);
        System.out.println("Proximo elemento do topo: "+ninjaStack.peek());
        //todo EM STACKS, O PEEK VISUALIZA O ULTIMO ELEMENTO, OU O DO TOPO!

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("QUEUES");

        Queue<String> ninjasQueues = new LinkedList<>();
        ninjasQueues.add("Naruto");
        ninjasQueues.add("Sasuke");
        ninjasQueues.add("Sakura");
        ninjasQueues.add("Kakashi");
        ninjasQueues.add("Shikamaru");

        //Mostrar a fila
        System.out.println("Ninjas na fila: "+ninjasQueues);

        ninjasQueues.poll();

        System.out.println("Ninja queue depoisd e rodar o poll: "+ ninjasQueues);

        System.out.println("Ninja no HEAD: "+ninjasQueues.peek());
        //todo EM QUEUES O PEEK VISUALIZA O PRIMEIRO DA FILA!
        // Adcionar à fila
        ninjasQueues.add("Hashirama");
        ninjasQueues.add("Tobirama");

    }

    //todo A ORDEM EM STACKS É ----> LIFO <---- LAST IN, FIRST OUT (O ÚLTIMO A ENTRAR, É O PRIMEIRO A SAIR)
    //
    //todo A ORDEM EM QUEUES É ----> FIFO <---- FIRST IN, FIRST OUT (O PRIMEIRO A ENTRAR É O PRIMEIRO A SAIR)
}
