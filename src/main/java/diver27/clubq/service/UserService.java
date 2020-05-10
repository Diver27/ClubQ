package diver27.clubq.service;

import diver27.clubq.model.User;
import diver27.clubq.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public boolean newUser(String username) {
        User user = new User();
        user.setUsername(username);
        userRepository.save(user);
        return true;
    }

    public Optional<User> getUserInfo(Integer userId) {
        return userRepository.findById(userId);
    }

    public boolean updateUserInfo(Integer userId, String infoText){
        userRepository.updateInfo(userId,infoText);
        return true;
    }
}
