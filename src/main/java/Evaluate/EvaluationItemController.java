package Evaluate;

import Evaluate.Data.*;
import Evaluate.Data.InSheet.EvaluationItem;
import Evaluate.Data.InSheet.StudentScore;
import Evaluate.Data.InSheet.User;
import Evaluate.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EvaluationItemController {

    private final EvaluationItemService evaluationItemService;
    private final StudentScoreService studentScoreService;
    private final AuditRecordService auditRecordService;
    private final AppealRecordService appealRecordService;
    private final UserService userService;

    @Autowired
    public EvaluationItemController(EvaluationItemService evaluationItemService, StudentScoreService studentScoreService, AuditRecordService auditRecordService, AppealRecordService appealRecordService, UserService userService) {
        this.evaluationItemService = evaluationItemService;
        this.studentScoreService = studentScoreService;
        this.auditRecordService = auditRecordService;
        this.appealRecordService = appealRecordService;
        this.userService = userService;
    }


    @GetMapping("/evaluation-items")
    public List<EvaluationItem> getEvaluationItems() {
        return evaluationItemService.getEvaluationItems();
    }

    @PostMapping("/evaluation-items")
    public ResponseEntity<String> submitEvaluationItem(@RequestBody EvaluationItem item) {
        evaluationItemService.saveEvaluationItem(item);
        return ResponseEntity.ok("综合测评项目提交成功");
    }

    @GetMapping("/student-scores")
    public List<StudentScore> getStudentScores(@RequestParam("studentId") String studentId) {
        return studentScoreService.getStudentScores(userService, studentId);
    }

    @PutMapping("/audit-records/{record-id}")
    public ResponseEntity<String> auditEvaluationItem(@PathVariable("record-id") String recordId, @RequestBody Result result) {
        auditRecordService.updateAuditResult(recordId, result);
        return ResponseEntity.ok("综合测评项目审核成功");
    }

    @PostMapping("/appeal-records")
    public ResponseEntity<String> submitAppealRecord(@RequestBody AppealData appealData) {
        appealRecordService.saveAppealRecord(appealData);
        return ResponseEntity.ok("申诉提交成功");
    }
}
