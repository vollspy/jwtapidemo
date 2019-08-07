package ru.tinkoff.petProject.jwtapidemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tinkoff.petProject.jwtapidemo.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);

}
