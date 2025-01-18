package br.com.apolinho.taskmaster.repository;

import br.com.apolinho.taskmaster.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
