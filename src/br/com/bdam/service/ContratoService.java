package br.com.bdam.service;

import br.com.bdam.dao.IContratoDao;

public class ContratoService implements IContratoService {
	
	IContratoDao contratoDao;
	
	public ContratoService(IContratoDao contratoDao) {
		this.contratoDao = contratoDao;
	}

	@Override
	public String salvar() {
		contratoDao.salvar();
		return "Sucesso";
	}

	@Override
	public String buscar() {
		contratoDao.buscar();
		return "Sucesso";
	}

	@Override
	public String excluir() {
		contratoDao.excluir();
		return "Sucesso";
	}

	@Override
	public String atualizar() {
		contratoDao.atualizar();
		return "Sucesso";
	}

}
