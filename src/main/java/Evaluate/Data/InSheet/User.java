package Evaluate.Data.InSheet;

import Evaluate.Data.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import java.security.Permission;
import java.util.Collection;
import java.util.Collections;

@Entity
@Getter
@Setter
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String username;
    private String password;
    private Role role;

    private String clazz;

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singletonList(role);
    }

    // 其他用户相关信息的字段和关联关系

    // 省略构造函数、Getter和Setter方法
}

