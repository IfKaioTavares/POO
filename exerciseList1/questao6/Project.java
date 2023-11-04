package exerciseList1.questao6;

import exerciseList1.questao6.enums.Status;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Project {
    private String name;
    private ArrayList<Task> tasks;
    public Project(String name){
        this.name = name;
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task newTask){
        if(!this.tasks.contains(newTask)){
            this.tasks.add(newTask);
        }
    }


    //[Done, Doing, Late]
    public List<Task> progress(){
        return List.copyOf(this.tasks);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(name, project.name) && Objects.equals(tasks, project.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tasks);
    }
}
