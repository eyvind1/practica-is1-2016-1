package service;
import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import repository.AccountRepository;
import repository.PersonRepository;
import domain.Account;
import domain.Alumno;
import domain.Curso;
import domain.Person;
public class CursoService {
	public Collection<Curso> findByCodigo(String codigo) {
		Curso curso = CursoRepository.find(codigo);
		if (curso != null) {
			return curso.getNombre();
		}
		return Collections.emptyList();
	}
}