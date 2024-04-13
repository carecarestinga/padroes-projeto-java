package dio.padroes.strategy.impl;

import dio.padroes.strategy.OperacaoStrategy;

/**
 * Classe que implementa a Interface OperacaoStrategy
 * Ela muda o comportamento para operação de Multiplicar
 */
public class MultiplicacaoStrategyImpl implements OperacaoStrategy {

    /**
     *
     * @param paramUm utilizados nas operações
     * @param paramDois utilizados nas operações
     * @return o resultado da Multiplicçaõ
     */
    @Override
    public double executarCalculo(double paramUm, double paramDois) {
        return paramUm * paramDois;
    }
}
