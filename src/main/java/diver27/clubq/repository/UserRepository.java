package diver27.clubq.repository;

import diver27.clubq.model.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    @Modifying
    @Query(value = "update club.user set info_text = ?2 where id = ?1", nativeQuery = true)
    public void updateInfo(Integer userId, String infoText);
}
