package com.produto.produtoservice.daos;

import com.produto.produtoservice.dtos.ProdutoDTO;
import com.produto.produtoservice.exception.BDException;

public interface IProdutoDAO{
	
	
	public static final String INSERT_PRODUTO = "INSERT INTO TBL_PRODUTO" +
			   " (dc_nome_produto) " +
			   " values (?)";
	
	public void insertProduto(ProdutoDTO produtoDTO) throws BDException;

}
