package dio.padroes.comportamentais.strategy.service.impl;

import dio.padroes.comportamentais.strategy.service.OperacaoStrategy;

/**
 * Classe que implementa a Interface OperacaoStrategy
 * Ela muda o comportamento para operação de Subtrair
 */
public class SubtracaoStrategyImpl implements OperacaoStrategy {

    /**
     * Método que Implementações das operações
     * @param paramUm utilizados nas operações
     * @param paramDois utilizados nas operações
     * @return o resultado da Subtração em double
     */
    @Override
    public double executarCalculo(double paramUm, double paramDois) {
        return paramUm - paramDois;
    }




}
