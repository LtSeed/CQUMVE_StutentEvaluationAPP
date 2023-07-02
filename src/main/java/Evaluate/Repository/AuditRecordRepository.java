package Evaluate.Repository;

import Evaluate.Data.InSheet.AuditRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditRecordRepository extends JpaRepository<AuditRecord, Long> {
    // 可以定义自定义的查询方法
}
