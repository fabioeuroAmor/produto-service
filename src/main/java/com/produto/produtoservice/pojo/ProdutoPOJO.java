package com.produto.produtoservice.pojo;

import com.produto.produtoservice.dtos.ProdutoDTO;
import com.produto.produtoservice.vos.ProdutoVO;

public class ProdutoPOJO {
	
	private ProdutoDTO  produtoDTO;
	private ProdutoVO produtoVO;
	public ProdutoDTO getProdutoDTO() {
		return produtoDTO;
	}
	public void setProdutoDTO(ProdutoDTO produtoDTO) {
		this.produtoDTO = produtoDTO;
	}
	public ProdutoVO getProdutoVO() {
		return produtoVO;
	}
	public void setProdutoVO(ProdutoVO produtoVO) {
		this.produtoVO = produtoVO;
	}
	
	public ProdutoVO tranformaProdutoVo(ProdutoDTO produtoDTO) {
		ProdutoVO produtoVO = new ProdutoVO();
		produtoVO.setIdProduto(produtoDTO.getIdProduto());
		produtoVO.setDcNomeProduto(produtoDTO.getDcNomeProduto());
		return produtoVO;
		
	}
	
	public ProdutoDTO tranformaProdutoDto(ProdutoVO produtoVO) {
		ProdutoDTO produtoDTO = new ProdutoDTO();
		produtoDTO.setIdProduto(produtoVO.getIdProduto());
		produtoDTO.setDcNomeProduto(produtoVO.getDcNomeProduto());
		return produtoDTO;		
	}

}
