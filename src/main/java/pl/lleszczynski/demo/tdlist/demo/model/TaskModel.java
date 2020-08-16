package pl.lleszczynski.demo.tdlist.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
public class TaskModel implements Serializable {

    private int id;
    private String taskName;
    private String description;
    private String  startDate;
    private String  endDate;

    public TaskModel(int id, String taskName, String description, String startDate, String endDate){
        this.id = id;
        this.taskName = taskName;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

}
