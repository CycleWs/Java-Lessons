package NivelIntermediario.MetodosConstantes;

import NivelIntermediario.MetodosConstantes.*;

public abstract class Ninja {


    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;

    //Argumento que NÃO poderá ser alterado!
    final String classe = "NINJA";

    NivelNinja rank;


    public Ninja() {
    }

    // Metodo existente: Primeiro metodo
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // Sobrecarga de metodos voce nao precisa redeclarar o construtor so os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }


    // Metodos geral! Todos os ninjas vao ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }

    //Métodos que não podem ser sobreescritos! (FINAL)
    final void declaracaoNinja(){
        System.out.println("Declaro por meio deste pergaminho que eu sou um ninja!");
    }




}
