package Evaluate.Data.InSheet;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "student_score")
public class StudentScore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private User user;

    @OneToMany(mappedBy = "studentScore", cascade = CascadeType.ALL)
    private List<EvaluationItem> items;


    private Double score;

    // 省略构造函数、Getter和Setter方法
}
