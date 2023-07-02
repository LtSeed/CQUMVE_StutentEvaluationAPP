package Evaluate.Data;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    Admin,BT,NORMAL;

    @Override
    public String getAuthority() {
        return name();
    }
}
