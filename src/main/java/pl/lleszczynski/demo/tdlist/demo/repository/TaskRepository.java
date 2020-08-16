package pl.lleszczynski.demo.tdlist.demo.repository;


import org.springframework.stereotype.Repository;
import pl.lleszczynski.demo.tdlist.demo.model.TaskModel;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskRepository {


    private final List<TaskModel> tasksModel = new ArrayList<> ();

    public List<TaskModel> findAll() {
        TaskModel taskModel = new TaskModel (1, "Lukasz", "Leszczynski", "20/05/2020", "21/05/2020");
        tasksModel.add (taskModel);
        return tasksModel;
    }


}
