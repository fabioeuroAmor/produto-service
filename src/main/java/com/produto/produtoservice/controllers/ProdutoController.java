package com.produto.produtoservice.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.produto.produtoservice.bos.ProdutoBO;
import com.produto.produtoservice.dtos.RetornoVO;
import com.produto.produtoservice.exception.BDException;
import com.produto.produtoservice.exception.NegocioException;
import com.produto.produtoservice.vos.ProdutoVO;



@RestController
@RequestMapping("/api/produto/v1")
public class ProdutoController implements IProdutoController {

	@Override
	@RequestMapping(value = "/cadastro", method =  RequestMethod.POST)
	public ResponseEntity<RetornoVO> cadastraTicket(String nomeProduto) throws BDException {
		RetornoVO retornoVO = new RetornoVO();
		ProdutoVO   produtoVO = new ProdutoVO();
		
		try {			
			produtoVO.setDcNomeProduto(nomeProduto);
			ProdutoBO.getInstance().insertProduto(produtoVO);
			retornoVO.setMensagensRetorno("Cadastro realizado com sucesso!!!");
			
		}catch (NegocioException e) {
			retornoVO.setMensagensRetorno(e.getMessage());
		}
		
		return ResponseEntity.ok(retornoVO);
	}

}
