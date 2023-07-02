package Evaluate.Service;

import Evaluate.Data.InSheet.StudentScore;
import Evaluate.Repository.StudentScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentScoreService {

    private final StudentScoreRepository studentScoreRepository;

    @Autowired
    public StudentScoreService(StudentScoreRepository studentScoreRepository) {
        this.studentScoreRepository = studentScoreRepository;
    }

    public List<StudentScore> getStudentScores(UserService studentService, String studentId) {
        return studentScoreRepository.findByUser(studentService.getStudent(studentId));
    }
}
