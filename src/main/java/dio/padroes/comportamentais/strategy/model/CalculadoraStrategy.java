package dio.padroes.comportamentais.strategy.model;

import dio.padroes.comportamentais.strategy.service.OperacaoStrategy;

/**
 * Classe do Contexto do Padrão Strategy
 */
public class CalculadoraStrategy {

    private OperacaoStrategy operacaoStrategy;

    public CalculadoraStrategy(){};

    public CalculadoraStrategy(OperacaoStrategy operacaoStrategy) {
        this.operacaoStrategy = operacaoStrategy;
    }

    /**
     * Método que Define o Operação a Ser Escolhida
     * @param operacaoStrategy identifica o Objeto que define a operação
     */
    public void definirOperacao(OperacaoStrategy operacaoStrategy) {
        this.operacaoStrategy = operacaoStrategy;
    }

    /**
     * Método que Realiza a Operação que foi Definida
     * @param n1 identifica o parametro a ser utilizado na operação
     * @param n2 identifica o parametro a ser utilizado na operação
     * @return
     */
    public double realizarOperacao(double n1, double n2) {
        return this.operacaoStrategy.executarCalculo(n1, n2);
    }

}
