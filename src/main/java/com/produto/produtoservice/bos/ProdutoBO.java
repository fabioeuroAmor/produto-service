package com.produto.produtoservice.bos;

import com.produto.produtoservice.daos.ProdutoDAO;
import com.produto.produtoservice.exception.BDException;
import com.produto.produtoservice.pojo.ProdutoPOJO;
import com.produto.produtoservice.vos.ProdutoVO;


public class ProdutoBO implements IProdutoBO{
	
	   private static ProdutoBO instance;
		
			public static ProdutoBO getInstance() {
				if (instance == null) {
					instance = new ProdutoBO();
				}
				return instance;
			}

	@Override
	public void insertProduto(ProdutoVO produtoVO) throws BDException {
		try {
			ProdutoPOJO ProdutoPOJO = new ProdutoPOJO();
			ProdutoDAO.getInstance().insertProduto(ProdutoPOJO.tranformaProdutoDto(produtoVO));
		} catch (Exception e) {
			throw new BDException(e.getMessage());
		}	
		
	}

}
