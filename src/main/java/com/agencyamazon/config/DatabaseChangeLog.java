package com.agencyamazon.config;

import com.agencyamazon.model.Role;
import com.agencyamazon.repository.RoleRepository;
import io.mongock.api.annotations.ChangeUnit;
import io.mongock.api.annotations.Execution;
import io.mongock.api.annotations.RollbackExecution;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@ChangeUnit(order = "001", id = "addRoles", author = "Bohdan Hovorukha")
public class DatabaseChangeLog {
    private final MongoTemplate mongoTemplate;

    @Execution
    public void addUserAndAdminRoles(RoleRepository roleRepository) {
        List<Role> roles = new ArrayList<>();
        roles.add(new Role(Role.RoleName.USER));
        roles.add(new Role(Role.RoleName.ADMIN));

        roleRepository.insert(roles);
    }

    @RollbackExecution
    public void rollback(RoleRepository roleRepository) {
        roleRepository.deleteAll();
    }
}
