package Evaluate.Data.InSheet;

import Evaluate.Data.Result;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "audit_record")
public class AuditRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recordId;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private EvaluationItem itemId;

    @ManyToOne
    @JoinColumn(name = "auditor_id")
    private User auditor;

    private Result result;
    private LocalDateTime auditTime;

    // 省略构造函数、Getter和Setter方法
}
