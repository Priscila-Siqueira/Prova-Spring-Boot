package com.senac.priscila.repository;

import com.senac.priscila.entity.RoleName;
import org.apache.catalina.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByName(RoleName name);
}
