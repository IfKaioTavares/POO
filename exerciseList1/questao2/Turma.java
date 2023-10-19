package exerciseList1.questao2;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String name;
    private List<Aluno> alunos = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();

    public Turma(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void addAluno(Aluno newAluno) {
        this.alunos.add(newAluno);
    }

    public void addProfessor(Professor newProfessor) {
        this.professores.add(newProfessor);
        newProfessor.addTurma(this);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Professor> getProfessores() {
        return professores;
    }
}
