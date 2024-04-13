# padroes-projeto-java
Desafio de Projeto do BootCamp Java AI Powered da DIO Explorando Padrões de Projetos na Prática com Java


- O padrão de design Strategy é um padrão comportamental que permite definir uma família de algoritmos, encapsulá-los e torná-los intercambiáveis. Ele permite que o algoritmo varie independentemente dos clientes que o utilizam.

- Neste exemplo em Java, implementamos uma calculadora simples usando o padrão Strategy. As operações matemáticas, como soma, subtração e multiplicação, são encapsuladas em classes separadas que implementam a mesma interface. A classe Calculadora utiliza um objeto de uma dessas classes para executar a operação desejada.


## Estrutura do Projeto

O projeto consiste nas seguintes classes:

* Operacao: Interface que define o método executarCalculo(), que representa uma operação matemática.
* Soma: Implementação da interface Operacao para realizar a operação de soma.
* Subtracao: Implementação da interface Operacao para realizar a operação de subtração.
* Multiplicacao: Implementação da interface Operacao para realizar a operação de multiplicação.
Calculadora: Classe de contexto que utiliza uma implementação de Operacao para executar uma operação matemática.

## Diagrama de Classe

                                +--------------------+
                                |  OperacaoStrategy  |
                                +--------------------+
                                | executarCalculo()  |
                                +--------------------+
                                          ^
                                          |
                        +-----------------+--------------+
                        |                 |              |
                 +--------+---------+     |     +--------+--------------+
                 | SomaStrategyImpl |     |     | SubtracaoStrategyImpl |
                 +----------------- +     |     +-----------------------+
                 | executarCalculo()|     |     |   executarCalculo()   |
                 +------------------+     |     +-----------------------+
                                          |
                                          |
                            +-------------+--------------+
                            | MultiplicacaoStrategyImpl  |
                            +----------------------------+
                            |     executarCalculo()      |
                            +----------------------------+

## Diagrama de Contexto

                        Class                           Interface
                +----------------------+        +-----------------------+
                | CalculadoraStrategy  |------->|  OperacaoStrategy     |
                +----------------------+        +-----------------------+
                                                | + executarCalculo()   |
                                                +-----------------------+
                                                |                       |
                                                +-----------------------+


No diagrama de classe, as classes Soma, Subtracao e Multiplicacao implementam a interface Operacao. A classe Calculadora é o contexto que utiliza uma implementação de Operacao para realizar cálculos.

No diagrama de contexto, a classe Calculadora depende da interface Operacao, permitindo que diferentes implementações de Operacao sejam injetadas dinamicamente.