package ru.shum.taskapp.repositpry;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.shum.taskapp.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
