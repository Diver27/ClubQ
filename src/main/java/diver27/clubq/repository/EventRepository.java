package diver27.clubq.repository;

import diver27.clubq.model.Act;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Act,Integer> {
}
