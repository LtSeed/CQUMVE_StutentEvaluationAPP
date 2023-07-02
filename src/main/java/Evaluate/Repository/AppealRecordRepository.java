package Evaluate.Repository;

import Evaluate.Data.InSheet.AppealRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppealRecordRepository extends JpaRepository<AppealRecord, Long> {
    // 可以定义自定义的查询方法
}
