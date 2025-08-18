<p align="center">
  <a href="" rel="noopener">
 <img width=100px height=200px src="./logoJava.png" alt="Project logo"></a>
</p>

<h3 align="center">Java Lessons</h3>

<div align="center">

[![Status](https://img.shields.io/badge/status-active-success.svg)]()
[![GitHub Issues](https://img.shields.io/github/issues/CycleWs/Java-Lessons.svg)](https://github.com/CycleWs/Java-Lessons/issues)
[![GitHub Pull Requests](https://img.shields.io/github/issues-pr/kylelobo/The-Documentation-Compendium.svg)](https://github.com/CycleWs/Java-Lessons/pulls)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](/LICENSE)

</div>

---

<p align="center">
  Repositório de estudos de JAVA, dividido por níveis, baseado no conteúdo do curso JAVA10X. O projeto ainda está em desenvolvimento e serve como material de apoio e prática dos principais conceitos da linguagem.
</p>

## 📝 Sumário

- [Sobre](#about)
- [Uso](#usage)
- [Tecnologias](#built_using)
- [Autores](#authors)
- [Agradecimentos](#acknowledgement)

## 🧐 Sobre <a name = "about"></a>

Este repositório contém exemplos e exercícios práticos dos principais tópicos de Java, organizados por níveis de dificuldade, conforme o curso JAVA10X. O objetivo é consolidar o aprendizado dos conceitos fundamentais e avançados da linguagem.

## Tópicos abordados:
### Nivel Iniciante:
- [**Tipagem de dados**](./src/NivelIniciante/TipagemDeDados/):
    - [**Dados Primitivos**](./src/NivelIniciante/TipagemDeDados/DadosPrimitivos.java): Explica sobre os tipos básicos da linguagem Java, como int, double, char e boolean. Eles armazenam valores simples diretamente na memória e não possuem métodos associados.
    - [**Dados NÃO Primitivos**](./src/NivelIniciante/TipagemDeDados/DadosNaoPrimitivos.java): Também chamados de tipos de referência, incluem classes, arrays, strings e objetos. Eles armazenam referências para valores na memória e podem ter métodos e propriedades.
- [**Condições**](./src/NivelIniciante/condicoes/):
  - [**Ifs e Elses**](./src/NivelIniciante/condicoes/IfnElse.java):
   Explica o uso de estruturas condicionais como `if` e `else` para tomar decisões no fluxo do programa, permitindo executar diferentes blocos de código conforme determinadas condições.
  - [**Switch Case**](./src/NivelIniciante/condicoes/SwitchCase.java): Explica a estrutura condicional que permite comparar o valor de uma variável com vários casos possíveis, facilitando a escolha entre múltiplas opções de execução de código de forma mais organizada do que vários if-else.
  - [**Ternários**](./src/NivelIniciante/condicoes/Ternarios.java): Fala um pouco sobre o operador ternário é uma forma compacta de escrever uma condição if-else em uma única linha, retornando um valor se a condição for verdadeira e outro se for falsa
- [**Laços de Repetição**](./src/NivelIniciante/lacosRepeticao/): Aborda os principais tipos de laços (`for`, `while`, `do-while`) utilizados para repetir instruções diversas vezes, facilitando tarefas como percorrer listas, contar ou executar ações até que uma condição seja satisfeita.
- [**Estrutura de dados basico**](./src/NivelIniciante/EstruturaDeDadosBasico/Arrays.java): Apresenta os conceitos iniciais sobre arrays em Java, mostrando como armazenar e manipular coleções de dados do mesmo tipo em uma estrutura indexada. É a base para entender como organizar e acessar múltiplos valores de forma eficiente.

 ### Nivel Intermediário:

- [**Classes Abstratas**](./src/NivelIntermediario/ClassesAbstratas/): Demonstra como criar classes que servem de base para outras, não podendo ser instanciadas diretamente.
- [**Construtores**](./src/NivelIntermediario/Construtores): Explica como inicializar objetos e definir valores iniciais para atributos das classes.
- [**Encapsulamento (Getters e Setters)**](./src/NivelIntermediario/Encapsulamento): Mostra como proteger os dados das classes e acessar/modificar atributos de forma controlada.
- [**Heranças Múltiplas**](./src/NivelIntermediario/HerancasMultiplas): Aborda como simular herança múltipla em Java utilizando interfaces, já que a linguagem não permite herança múltipla direta entre classes.
- [**Interfaces**](./src/NivelIntermediario/Interfaces): Ensina como definir contratos que as classes devem seguir, promovendo flexibilidade e desacoplamento.
- [**Métodos Constantes**](./src/NivelIntermediario/MetodosConstantes): Explica o uso de métodos e atributos constantes (final/static) para valores imutáveis e comportamentos compartilhados.
- [**Overload**](./src/NivelIntermediario/Overload): Demonstra como criar métodos com o mesmo nome, mas com diferentes parâmetros, aumentando a flexibilidade do código.
- [**Polimorfismo**](./src/NivelIntermediario/Polimorfismo): Mostra como objetos podem assumir diferentes formas, permitindo o uso de uma interface comum para diferentes tipos de objetos.
- [**Estrutura de dados**](./src/NivelIntermediario/EstruturaDeDados/):
  - [**Array, Lists & Hashsets**](./src/NivelIntermediario/EstruturaDeDados/ArrayNListsNHashsets/): Explica a diferença entre Arrays, Lists e Hashsets em Java, abordando suas principais características, usos e limitações.
  - [**Stacks & Queues**](./src/NivelIntermediario/EstruturaDeDados/StacksNQueues/): Explica o funcionamento das estruturas de dados pilha (Stack) e fila (Queue). Stacks seguem o princípio LIFO (Last In, First Out), onde o último elemento inserido é o primeiro a ser removido. Queues seguem o princípio FIFO (First In, First Out), onde o primeiro elemento inserido é o primeiro a ser removido. Ambas são úteis para
- [**ENUMs**](./src/NivelIntermediario/ENUMs): Demonstra como utilizar tipos enumerados para representar conjuntos fixos de constantes, tornando o código mais legível e seguro.
- [**Genericos**](./src/NivelIntermediario/Genericos): Ensina como criar classes, interfaces e métodos genéricos para trabalhar com diferentes tipos de dados de forma flexível e segura.
- [**Records**](./src/NivelIntermediario/Records): Apresenta a estrutura de Records, utilizada para criar classes imutáveis de forma simples e concisa.

### Pré-requisitos

- Java JDK instalado (recomendado versão 8 ou superior)
- IDE de sua preferência (Eclipse, IntelliJ, VS Code, etc.)

### Instalando

Clone o repositório:
```
git clone https://github.com/CycleWs/Java-Lessons.git
```

Abra o projeto na sua IDE e explore os exemplos em cada pasta de nível.

## 🔧 Rodando os testes <a name = "tests"></a>

Caso existam testes automatizados, utilize sua IDE ou o comando:
```
javac NomeDoArquivoTeste.java
java NomeDoArquivoTeste
```

## 🎈 Uso <a name="usage"></a>

Explore os exemplos de cada tópico para entender a aplicação dos conceitos. Modifique e teste os códigos para fixar o aprendizado.

## ⛏️ Tecnologias <a name = "built_using"></a>

- [Java](https://www.java.com/) - Linguagem principal
- [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea) ou outra IDE de sua escolha

## ✍️ Autores <a name = "authors"></a>

- [@CycleWs](https://github.com/CycleWs) - Estudos e organização do repositório

## 🎉 Agradecimentos <a name = "acknowledgement"></a>

- [@Fiasco](https://github.com/horaciomuller) Criador do curso JAVA10X seguido para base deste repositório