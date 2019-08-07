package ru.tinkoff.petProject.jwtapidemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tinkoff.petProject.jwtapidemo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
