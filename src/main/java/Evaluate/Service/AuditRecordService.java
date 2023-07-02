package Evaluate.Service;

import Evaluate.Data.InSheet.AuditRecord;
import Evaluate.Data.Result;
import Evaluate.Repository.AuditRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuditRecordService {

    private final AuditRecordRepository auditRecordRepository;

    @Autowired
    public AuditRecordService(AuditRecordRepository auditRecordRepository) {
        this.auditRecordRepository = auditRecordRepository;
    }

    public void updateAuditResult(String recordId, Result result) {
        Optional<AuditRecord> opt_auditRecord = auditRecordRepository.findById(Long.valueOf(recordId));

        if (opt_auditRecord.isPresent()) {
            AuditRecord auditRecord = opt_auditRecord.get();
            auditRecord.setResult(result);
            auditRecordRepository.save(auditRecord);
        }
    }
}

