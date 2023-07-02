package Evaluate.Data.InSheet;

import Evaluate.Data.EvaluationItemType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "evaluation_item")
public class EvaluationItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    @ManyToOne
    @JoinColumn(name = "owner")
    private User owner;

//    private String itemName;
    private EvaluationItemType itemType;
//    private Double itemWeight;

    // 省略构造函数、Getter和Setter方法
}
