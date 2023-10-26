package exerciseList1.questao2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.List;

public class Aluno {
    private String name;
    private ArrayList<Turma> classList = new ArrayList<Turma>();
    public Aluno(String name){
        this.name = name;
    }
    public void getInClass(Turma newClass){
        if(!this.classList.contains(newClass)){
            this.classList.add(newClass);
            newClass.addStudent(this);
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
        if (!(o instanceof Aluno aluno)) return false;
        return Objects.equals(getName(), aluno.getName()) && Objects.equals(getClassList(), aluno.getClassList());
    }
    @Override
    public String toString() {
        return "Aluno{" +
                "name='" + name + '\'' +
                '}';
    }
}
