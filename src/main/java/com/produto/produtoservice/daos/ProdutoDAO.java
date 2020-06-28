package com.produto.produtoservice.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.produto.produtoservice.dtos.ProdutoDTO;
import com.produto.produtoservice.exception.BDException;


public class ProdutoDAO extends PersistenceManagerDAO implements IProdutoDAO {
	
   private static ProdutoDAO instance;
	
	public static ProdutoDAO getInstance(){
		if (instance == null) {
			instance = new ProdutoDAO();
		}
		return instance;
	}

	@Override
	public void insertProduto(ProdutoDTO produtoDTO) throws BDException {
		 Connection conn = null;
		 PreparedStatement stmt = null;	
		 
		 try {
			 conn = PersistenceManagerDAO.getConnection();
			 stmt = conn.prepareStatement(INSERT_PRODUTO);
			 
			 stmt.setString(1, produtoDTO.getDcNomeProduto());			 
			 stmt.executeUpdate();
			 
			//conn.commit();
				
				//Gerenciamento de commit ao banco
//				quantPautaInseridos++;
//				if (quantPautaInseridos == quantMaximaPautaCache) {
//					conn.commit();
//					quantPautaInseridos = 0;
//					System.out.println("Bloco de ["+quantMaximaPautaCache+"] inseridas");
//				}
			 
		}catch (SQLException e) {
			throw new BDException(e.getMessage());
	    } catch (Exception e) {			
			e.printStackTrace();
	    }finally {
		  PersistenceManagerDAO.closeStatement(stmt);
		  PersistenceManagerDAO.closeConnection(conn);
	    }	
		
	}

}
