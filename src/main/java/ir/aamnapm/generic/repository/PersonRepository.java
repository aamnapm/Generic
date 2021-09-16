package ir.aamnapm.generic.repository;

import ir.aamnapm.generic.model.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends GenericRepository<Person, Long> {
}
