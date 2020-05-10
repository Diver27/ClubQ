package diver27.clubq.repository;

import diver27.clubq.model.Event;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventRepository extends CrudRepository<Event,Integer> {
    @Query(value="select * from act order by act_time limit ?2 offset ?1",nativeQuery = true)
    public List<Event> findEventsByPage(int head, int pageLimit);

    @Query(value="select * from act order by rand() limit ?1",nativeQuery = true)
    public List<Event> findEventsByRandom(int pageLimit);

    //Todo: 关键词搜索
}
