package cristovaoperez.repositories;

import org.springframework.data.repository.CrudRepository;

import cristovaoperez.models.Professor;

public interface ProfessoresRepository extends CrudRepository<Professor, Integer> {
    
}