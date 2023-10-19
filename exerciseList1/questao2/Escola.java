package exerciseList1.questao2;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String name;
    private List<Turma> turmas = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();

    public Escola(String name){
        this.name = name;
    }

    public void addTurma(Turma newTurma){
        if(!BuscaUtil.existTurma(this.turmas, newTurma)){
            this.turmas.add(newTurma);
        }
    }

    public void addProfessor(Professor newProfessor){
        if(!BuscaUtil.existProfessor(this.professores, newProfessor)){
            this.professores.add(newProfessor);
        }
    }

    
}