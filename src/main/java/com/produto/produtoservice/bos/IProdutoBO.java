package com.produto.produtoservice.bos;

import com.produto.produtoservice.dtos.ProdutoDTO;
import com.produto.produtoservice.exception.BDException;
import com.produto.produtoservice.vos.ProdutoVO;

public interface IProdutoBO {
	
	public void insertProduto(ProdutoVO produtoVO) throws BDException;

}
