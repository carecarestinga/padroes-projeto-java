package dio.padroes.estruturais.facade.facade;

import dio.padroes.estruturais.facade.model.Endereco;
import dio.padroes.estruturais.facade.services.ClienteDao;
import dio.padroes.estruturais.facade.model.Cliente;
import dio.padroes.estruturais.facade.model.Contato;

public class FacadeCliente {

    public void cadastrar() {
        Endereco endereco= new Endereco("Rua bbbbb","200");
        Contato contato = new Contato("1111-1111","teste@teste.com.br");
        Cliente cliente = new Cliente("Cliente1", endereco, contato);
        ClienteDao clienteDao = new ClienteDao(cliente);
        clienteDao.cadastrar(cliente);
        System.out.println("Cliente " + cliente.getNome() + " Cadastrado com Sucesso");
    }

}
