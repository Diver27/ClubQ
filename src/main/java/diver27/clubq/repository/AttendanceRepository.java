package diver27.clubq.repository;

import diver27.clubq.model.Attendance;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AttendanceRepository extends CrudRepository<Attendance,Integer> {
    @Query(value = "select * from user_act where user_id = ?1",nativeQuery = true)
    public List<Attendance> findByUserId(Integer userId);
}
