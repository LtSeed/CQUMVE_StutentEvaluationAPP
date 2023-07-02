package Evaluate.Repository;

import Evaluate.Data.InSheet.StudentScore;
import Evaluate.Data.InSheet.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentScoreRepository extends JpaRepository<StudentScore, Long> {
    List<StudentScore> findByUser(User user);
    // 可以定义自定义的查询方法
}
