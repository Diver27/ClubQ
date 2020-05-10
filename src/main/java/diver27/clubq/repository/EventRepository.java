package diver27.clubq.repository;

import diver27.clubq.model.Event;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EventRepository extends CrudRepository<Event,Integer> {
    @Query(value="select * from act order by act_time desc limit ?2 offset ?1",nativeQuery = true)
    public List<Event> findEventsByPage(int head, int pageLimit);

    @Query(value="select * from act order by rand() limit ?1",nativeQuery = true)
    public List<Event> findEventsByRandom(int pageLimit);

    @Query(value="select * from act where act_name like %?1% limit ?3 offset ?2",nativeQuery = true)
    public List<Event> findEventsByTitle(String title, int head, int PageLimit);

    @Query(value = "select distinct * from act where act_id in (select act_id from user_act where user_id = ?1)",nativeQuery = true)
    public List<Event> findEventsByUserId(Integer userId);
}
