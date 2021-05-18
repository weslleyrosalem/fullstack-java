package br.com.fullstack.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.fullstack.model.Artista;
import br.com.fullstack.model.Usuario;

public interface ArtistaDAO extends CrudRepository<Artista, Integer> {
	
	//public List<Artista> findByNome(String nome);
	public List<Artista> findByNomeArtistico(String nomeArtistico);
	public List<Artista> findByNacionalidade(String nacionalidade);
	

}
