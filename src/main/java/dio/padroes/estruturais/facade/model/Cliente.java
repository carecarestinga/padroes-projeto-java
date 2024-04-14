package dio.padroes.estruturais.facade.model;

public class Cliente {

    private String nome;
    private Endereco endereco;
    private Contato contato;

    public Cliente(String _nome, Endereco _endereco, Contato _contato) {
        this.nome = _nome;
        this.endereco = _endereco;
        this.contato = _contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
}
