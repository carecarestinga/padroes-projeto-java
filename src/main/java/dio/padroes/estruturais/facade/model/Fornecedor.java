package dio.padroes.estruturais.facade.model;

public class Fornecedor {

    private String nome;
    private Endereco endereco;
    private Contato contato;

    public Fornecedor(String _nome, Endereco _endereco, Contato _contato) {
        this.nome = _nome;
        this.endereco = _endereco;
        this.contato = _contato;
    }
}
