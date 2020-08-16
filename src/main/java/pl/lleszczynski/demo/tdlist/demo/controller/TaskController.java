package pl.lleszczynski.demo.tdlist.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.lleszczynski.demo.tdlist.demo.model.TaskModel;
import pl.lleszczynski.demo.tdlist.demo.service.TaskService;

import java.util.List;

@Controller
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping(value = {"/","/index"})
    public String index(Model model) {
        model.addAttribute ("pageTitle", " TasksModel");
        return "index";
    }
    @GetMapping(value = "/tasksModel")
    public String getTasksModel (Model model, @RequestParam(value = "page", defaultValue ="1") int pageNumber){
        List<TaskModel> TaskModel = TaskService.findAll ();
        model.addAttribute ("tasksModel", TaskModel);
        return "TasksModel-list";
    }

}
