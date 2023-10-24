package exerciseList1.questao2;

import java.util.ArrayList;
import java.util.Objects;

public class Professor {
    private String name;
    private ArrayList<Turma> classList = new ArrayList<Turma>();

    public Professor(String name){
        this.name = name;
    }
    public void getInClass(Turma newClass){
        if(!this.classList.contains(newClass)){
            this.classList.add(newClass);
        }
    }
    public String getName() {
        return name;
    }

    public ArrayList<Turma> getClassList() {
        return classList;
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
