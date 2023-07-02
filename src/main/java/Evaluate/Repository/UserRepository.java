package Evaluate.Repository;

import Evaluate.Data.InSheet.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // 可以定义自定义的查询方法，如根据用户名查询用户
    User findByUsername(String username);
}

