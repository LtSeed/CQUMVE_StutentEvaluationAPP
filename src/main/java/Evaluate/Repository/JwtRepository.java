package Evaluate.Repository;

import Evaluate.Data.InSheet.EvaluationItem;
import Evaluate.Data.InSheet.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JwtRepository extends JpaRepository<User, Long> {
    User getUserFromToken(String token);
}