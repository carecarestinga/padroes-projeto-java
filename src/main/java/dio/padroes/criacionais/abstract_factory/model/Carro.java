package dio.padroes.criacionais.abstract_factory.model;

public class Carro {

    private String nome;
    private String modelo;
    private Roda roda;
    private Som som;

    public Roda getRoda() {
        return roda;
    }

    public void setRoda(Roda roda) {
        this.roda = roda;
    }

    public Som getSom() {
        return som;
    }

    public void setSom(Som som) {
        this.som = som;
    }
}
