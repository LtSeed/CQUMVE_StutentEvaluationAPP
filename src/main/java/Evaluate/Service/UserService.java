package Evaluate.Service;

import Evaluate.Data.InSheet.User;
import Evaluate.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getStudent(String studentId) {
        Optional<User> byId = userRepository.findById(Long.valueOf(studentId));
        return byId.orElse(null);
    }

    public User getStudentByUsername(String username){
        return userRepository.findByUsername(username);
    }
}