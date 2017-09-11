package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.TaskList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface TaskListDao extends CrudRepository<TaskListDao, Integer>{ // CrudRepository ??
    List<TaskList> findByListName(String listName);
}
