package br.com.fullstack.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import br.com.fullstack.model.Artista;
import br.com.fullstack.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{
	
	// Dao (é um Pattern - CRUD em uma classe)
	// Gravar - consultar - excluir - alterar
	
	
	// save(objeto) : void
	// findById(int) : objeto
	// findAll() : iterable
	// deleteById(int) : void
	// deleteAll()
	
	
	public List<Usuario> findByNome(String nome);
	public List<Usuario> findByNomeLike(String nome);
	public Usuario findByEmailAndSenha(String email, String senha);
	
	
	

}
