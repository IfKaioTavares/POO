package exerciseList1.questao6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {
    private String name;
    private int age;
    private ArrayList<Task> taskList;

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
        this.taskList = new ArrayList<>();
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void addTask(Task newTask){
        if(!this.taskList.contains(newTask)){
            this.taskList.add(newTask);
            newTask.addResponsible(this);
        }
    }
    public List<Task> getTaskList() {
        return List.copyOf(this.taskList);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
