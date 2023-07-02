package Evaluate.Data.InSheet;

import Evaluate.Data.AppealStatus;
import Evaluate.Data.Result;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "appeal_record")
public class AppealRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recordId;

    @ManyToOne
    @JoinColumn(name = "audit_record")
    private AuditRecord auditRecord;

    @ManyToOne
    @JoinColumn(name = "auditor_id")
    private User auditor;

    private Result result;
    private AppealStatus appealStatus;
    private LocalDateTime appealTime;
    private String appealContent;



    // 省略构造函数、Getter和Setter方法
}
