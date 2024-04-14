package dio.padroes.comportamentais.strategy.service;

/**
 * Interface que irá fazer o contrato de suas funções com as que contratarem
 * e implementarem seus serviços das opreações
 */
public interface OperacaoStrategy {
    /**
     * Método a ser implementado aos contratos
     * @param paramUm utilizados nas operações
     * @param paramDois utilizados nas operações
     * @return
     */
    double executarCalculo(double paramUm, double paramDois);

}
