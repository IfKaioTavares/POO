package exerciseList1.questao6;

import exerciseList1.questao6.enums.Status;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Task {
    private String name;
    private Status status;
    private ArrayList<Employee> responsibles;

    public Task(String name, Status status){
        this.name = name;
        this.status = status;
        this.responsibles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Employee> getResponsibles() {
        return List.copyOf(this.responsibles);
    }

    public void addResponsible(Employee newResponsible){
        if(!this.responsibles.contains(newResponsible)){
            this.responsibles.add(newResponsible);
            newResponsible.addTask(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(name, task.name) && status == task.status && Objects.equals(responsibles, task.responsibles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status, responsibles);
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
