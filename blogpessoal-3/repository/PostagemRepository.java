package org.generation.blogpessoal.repository;

import java.util.List;

import org.generation.blogpessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>  {
	
	//SELECT * FROM tb_postagens WHERE titulo LIKE "%%";
	
	    public List <Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo")String titulo);
}