package exerciseList1.questao2;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String name;
    private List<Turma> turmas = new ArrayList<>();

    public Professor(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addTurma(Turma newTurma){
        this.turmas.add(newTurma);
    }

    public List<Turma> getTurmas() {
        return turmas;
    }
}
