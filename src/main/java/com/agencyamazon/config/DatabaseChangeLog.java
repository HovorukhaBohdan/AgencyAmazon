package com.agencyamazon.config;

import com.agencyamazon.model.Role;
import com.agencyamazon.repository.RoleRepository;
import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;

import java.util.ArrayList;
import java.util.List;

@ChangeLog
public class DatabaseChangeLog {
    @ChangeSet(order = "001", id = "addRoles", author = "Bohdan Hovorukha")
    public void addUserAndAdminRoles(RoleRepository roleRepository) {
        List<Role> roles = new ArrayList<>();
        roles.add(new Role(Role.RoleName.USER));
        roles.add(new Role(Role.RoleName.ADMIN));

        roleRepository.insert(roles);
    }
}
