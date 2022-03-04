package io.getarrays.userservice.repository;

import io.getarrays.userservice.domain.Role;
import io.getarrays.userservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
