package dio.padroes.criacionais.abstract_factory.factory;

import dio.padroes.criacionais.abstract_factory.model.Roda;
import dio.padroes.criacionais.abstract_factory.model.Som;

public abstract class CarroFactory {

    public abstract Roda montarRoda();
    public abstract Som montarSom();

}
