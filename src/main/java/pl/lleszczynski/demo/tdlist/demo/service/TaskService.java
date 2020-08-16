package pl.lleszczynski.demo.tdlist.demo.service;


import org.springframework.stereotype.Service;
import pl.lleszczynski.demo.tdlist.demo.model.TaskModel;
import pl.lleszczynski.demo.tdlist.demo.repository.TaskRepository;

import java.util.List;

@Service
public class TaskService {

    private static TaskRepository taskRepository;

   public TaskService(TaskRepository taskRepository){
       this.taskRepository = taskRepository;
   }

   public static List<TaskModel> findAll(){
       return taskRepository.findAll ();
   }

}
