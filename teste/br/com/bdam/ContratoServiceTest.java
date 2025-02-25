package br.com.bdam;


import br.com.bdam.dao.ContratoDao;
import br.com.bdam.dao.IContratoDao;
import br.com.bdam.dao.mock.ContratoDaoMock;
import br.com.bdam.service.ContratoService;
import br.com.bdam.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {
	
	@Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
    
    @Test
    public void buscarTest() {
    	IContratoDao dao = new ContratoDaoMock();
    	IContratoService service = new ContratoService(dao);
    	String retorno = service.buscar();
    	Assert.assertEquals("Sucesso", retorno);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso", retorno);
    }
    
    @Test
    public void exluirTest() {
    	IContratoDao dao = new ContratoDaoMock();
    	IContratoService service = new ContratoService(dao);
    	String retorno = service.excluir();
    	Assert.assertEquals("Sucesso", retorno);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso", retorno);
    }
    
    @Test
    public void atualizarTest() {
    	IContratoDao dao = new ContratoDaoMock();
    	IContratoService service = new ContratoService(dao);
    	String retorno = service.atualizar();
    	Assert.assertEquals("Sucesso", retorno);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
