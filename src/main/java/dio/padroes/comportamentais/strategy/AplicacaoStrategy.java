package dio.padroes.comportamentais.strategy;

import dio.padroes.comportamentais.strategy.service.impl.SomaStrategyImpl;
import dio.padroes.comportamentais.strategy.service.impl.SubtracaoStrategyImpl;
import dio.padroes.comportamentais.strategy.service.impl.MultiplicacaoStrategyImpl;
import dio.padroes.comportamentais.strategy.model.CalculadoraStrategy;

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