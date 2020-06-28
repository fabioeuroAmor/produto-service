package com.produto.produtoservice.vos;

import java.io.Serializable;

public class ProdutoVO implements Serializable{
	
	private Integer idProduto;
	private String dcNomeProduto;
	
	public Integer getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}
	public String getDcNomeProduto() {
		return dcNomeProduto;
	}
	public void setDcNomeProduto(String dcNomeProduto) {
		this.dcNomeProduto = dcNomeProduto;
	}
	
	@Override
	public String toString() {
		return "ProdutoVO [idProduto=" + idProduto + ", dcNomeProduto=" + dcNomeProduto + "]";
	}
	
	

}
