package dio.padroes.criacionais.abstract_factory.factory;

import dio.padroes.criacionais.abstract_factory.model.Roda;
import dio.padroes.criacionais.abstract_factory.model.RodaSimples;
import dio.padroes.criacionais.abstract_factory.model.Som;
import dio.padroes.criacionais.abstract_factory.model.TocaFitas;

public class CarroPopularFactory extends CarroFactory {
    @Override
    public Roda montarRoda() {
        return new RodaSimples();
    }

    @Override
    public Som montarSom() {
        return new TocaFitas();
    }
}
