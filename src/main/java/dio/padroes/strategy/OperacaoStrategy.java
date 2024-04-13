package dio.padroes.strategy;

/**
 * Interface que irá fazer o contrato de suas funções com as que contratarem
 * e implementarem seus serviços
 */
public interface OperacaoStrategy {

    double executarCalculoOperacao(double paramUm, double paramDois);

}
