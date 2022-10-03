package cristovaoperez.repositories;

import org.springframework.data.repository.CrudRepository;

import cristovaoperez.models.Aluno;

public interface AlunosRepository extends CrudRepository<Aluno, Integer> {
    
}