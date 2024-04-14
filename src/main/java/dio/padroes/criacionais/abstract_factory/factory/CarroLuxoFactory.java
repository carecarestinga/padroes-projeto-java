package dio.padroes.criacionais.abstract_factory.factory;

import dio.padroes.criacionais.abstract_factory.model.CdPlayer;
import dio.padroes.criacionais.abstract_factory.model.Roda;
import dio.padroes.criacionais.abstract_factory.model.RodaLigaLeve;
import dio.padroes.criacionais.abstract_factory.model.Som;

public class CarroLuxoFactory extends CarroFactory {
    @Override
    public Roda montarRoda() {
        return new RodaLigaLeve();
    }

    @Override
    public Som montarSom() {
        return new CdPlayer();
    }
}
