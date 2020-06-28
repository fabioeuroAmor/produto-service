package com.produto.produtoservice.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

import com.produto.produtoservice.dtos.RetornoVO;
import com.produto.produtoservice.exception.BDException;



public interface IProdutoController {

	public ResponseEntity<RetornoVO> cadastraTicket(@RequestParam String nomeProduto) throws BDException;
}
