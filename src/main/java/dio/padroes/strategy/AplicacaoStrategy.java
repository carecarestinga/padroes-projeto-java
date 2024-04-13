package dio.padroes.strategy;

import dio.padroes.strategy.impl.MultiplicacaoStrategyImpl;
import dio.padroes.strategy.impl.SomaStrategyImpl;
import dio.padroes.strategy.impl.SubtracaoStrategyImpl;

/**
 * Classe Principal da Aplicação que irá formar os contextos
 */
public class AplicacaoStrategy {

    private static CalculadoraStrategy calculadora;

    public static void main(String[] args) {

        // Defini a calculadora com a operação de soma
        calculadora = new CalculadoraStrategy(new SomaStrategyImpl());
        double resultado = calculadora.realizarOperacao(20, 5);
        System.out.println("Resultado da soma: " + resultado);

        // Defini a operação para subtração
        calculadora.definirOperacao(new SubtracaoStrategyImpl());
        resultado = calculadora.realizarOperacao(10, 5);
        System.out.println("Resultado da subtração: " + resultado);

        // Defini a operação para multiplicação
        calculadora.definirOperacao(new MultiplicacaoStrategyImpl());
        resultado = calculadora.realizarOperacao(10, 5);
        System.out.println("Resultado da subtração: " + resultado);

    }

}