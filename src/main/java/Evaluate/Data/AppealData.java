package Evaluate.Data;

import Evaluate.Data.InSheet.User;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class AppealData {
    private User student;
    private String appealContent;
    private Result result;
    private LocalDateTime appealTime;
    private AppealStatus appealStatus;

    // 构造函数、Getter和Setter方法

    // 省略其他属性和方法
}

