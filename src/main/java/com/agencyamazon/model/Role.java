package com.agencyamazon.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;

@Document(collection = "roles")
@Data
@NoArgsConstructor
public class Role implements GrantedAuthority {
    @Id
    private String id;
    private RoleName roleName;

    public Role(RoleName roleName) {
        this.roleName = roleName;
    }

    @Override
    public String getAuthority() {
        return "ROLE_" + roleName.name();
    }

    public enum RoleName {
        ADMIN,
        USER
    }
}
