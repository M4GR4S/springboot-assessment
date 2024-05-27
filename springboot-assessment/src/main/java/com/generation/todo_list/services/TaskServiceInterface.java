package com.generation.todo_list.services;

import com.generation.todo_list.models.Task;

import java.util.List;
import java.util.Optional;

public interface TaskServiceInterface {

    // Method signatures to work on Tasks Data

    // Create Customer
    public abstract Optional<Task> createNewTask(Task task);

    // Get all tasks
    public abstract List<Task> getAllTasks();

    // Get all completed tasks
    public abstract List<Task> findAllCompletedTask();

    // Get all incomplete tasks
    public abstract List<Task> findAllInCompleteTask();

    // Get task by id
    public abstract Optional<Task> findTaskById(Long id);

    // Update task
    public abstract Optional<Task> updateTask(Long id, Task task);

    // Delete task
    public abstract boolean deleteTask(Long id);

    // Get Task by id
    public abstract Optional<Task> getTask(Long id);

}
