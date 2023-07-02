package Evaluate.Repository;

import Evaluate.Data.InSheet.EvaluationItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluationItemRepository extends JpaRepository<EvaluationItem, Long> {
    // 可以定义自定义的查询方法
}
