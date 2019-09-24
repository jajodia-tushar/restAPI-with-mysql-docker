package com.tavisca.restAPI.repository;

import com.tavisca.restAPI.dataObjects.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Integer> {
}
