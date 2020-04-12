package br.com.petfriendly.DAO;

	
import java.util.List;
	
public interface GenericDao<T,K> {
		
		void cadastrar(T entidade);
		
		void atualizar(T entidade);
		
		T buscar(Long id) ;
		
		void remover(K chave) throws Exception ;
		
		List<T> listar();
		
	}
	
	
	

