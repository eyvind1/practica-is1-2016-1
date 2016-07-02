package repository;

import java.util.Collection;

import domain.Account;
import domain.Curso;

public interface CursoRepository extends BaseRepository<Curso, Long>{
	Collection<Curso> findByCodigo(String codigo);
}
