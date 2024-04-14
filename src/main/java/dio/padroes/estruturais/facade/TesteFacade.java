package dio.padroes.estruturais.facade;

import dio.padroes.estruturais.facade.facade.FacadeCliente;
import dio.padroes.estruturais.facade.facade.FacadeFornecedor;

public class TesteFacade {

        public static void main(String[] args) {
            FacadeCliente fc = new FacadeCliente();
            fc.cadastrar();
            FacadeFornecedor ff = new FacadeFornecedor();
            ff.cadastrar();
        }

}
