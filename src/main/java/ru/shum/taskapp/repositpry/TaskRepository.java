package ru.shum.taskapp.repositpry;

import ru.shum.taskapp.enums.Status;
import ru.shum.taskapp.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.shum.taskapp.models.User;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Long> {
    Task findByNameTask(String name);
    List<Task> findTaskByStatus(Status status);
    List<Task> findByExecutors(User executor);
}
