package dio.padroes.strategy.impl;

import dio.padroes.strategy.OperacaoStrategy;

/**
 * Classe que implementa a Interface OperacaoStrategy
 * Ela muda o comportamento para operação de Somar
 */
public class SomaStrategyImpl implements OperacaoStrategy {

    /**
     * Método que Implementações das operações
     * @param paramUm utilizados nas operações
     * @param paramDois utilizados nas operações
     * @return o resultado da Soma em double
     */
    @Override
    public double executarCalculo(double paramUm, double paramDois) {
        return paramUm + paramDois;
    }
}
