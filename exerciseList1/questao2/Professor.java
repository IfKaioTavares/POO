package exerciseList1.questao2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.List;

public class Professor {
    private String name;
    private ArrayList<Turma> classList = new ArrayList<Turma>();

    public Professor(String name){
        this.name = name;
    }
    public void getInClass(Turma newClass){
        if(!this.classList.contains(newClass)){
            this.classList.add(newClass);
            newClass.addTeacher(this);
        }
    }
    public String getName() {
        return name;
    }

    public List<Turma> getClassList() {
        return Collections.unmodifiableList(this.classList);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor professor)) return false;
        return Objects.equals(getName(), professor.getName()) && Objects.equals(getClassList(), professor.getClassList());
    }
    @Override
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                '}';
    }
}
