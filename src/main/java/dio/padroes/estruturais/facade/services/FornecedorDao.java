package dio.padroes.estruturais.facade.services;

import dio.padroes.estruturais.facade.model.Fornecedor;

public class FornecedorDao {

    private Fornecedor fornecedor;

    public FornecedorDao(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void cadastrar(Fornecedor fornecedor){}

}
