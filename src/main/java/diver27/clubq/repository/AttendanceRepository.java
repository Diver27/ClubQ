package diver27.clubq.repository;

import diver27.clubq.model.User_act;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AttendanceRepository extends CrudRepository<User_act,Integer> {
    @Query(value = "select * from user_act where user_id = ?1",nativeQuery = true)
    public List<User_act> findByUserId(Integer userId);
}
