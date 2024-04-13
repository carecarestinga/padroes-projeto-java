package dio.padroes.strategy;

import dio.padroes.strategy.impl.SomaStrategyImpl;

/**
 * Classe do Contexto do Padrão Strategy
 */
public class CalculadoraStrategy {

    private OperacaoStrategy operacaoStrategy;

    public CalculadoraStrategy(){};

    public CalculadoraStrategy(OperacaoStrategy operacaoStrategy) {
        this.operacaoStrategy = operacaoStrategy;
    }

    public void definirOperacao(OperacaoStrategy operacaoStrategy) {
        this.operacaoStrategy = operacaoStrategy;
    }

    public double realizarOperacao(double n1, double n2) {
        return this.operacaoStrategy.executarCalculo(n1, n2);
    }

}
