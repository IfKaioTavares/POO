package exerciseList1.questao2;

import java.util.List;

public abstract class BuscaUtil {
    public static boolean existTurma(List<Turma> turmas, Turma newTurma){
        for (Turma turma : turmas) {
            if(turma.getName().equalsIgnoreCase(newTurma.getName()) || turma.equals(newTurma));
                return true;
        }
        return false;
    }
    public static boolean existProfessor(List<Professor> professores, Professor newProfessor){
        for (Professor professor : professores) {
            if(professor.getName().equalsIgnoreCase(newProfessor.getName()) || professor.equals(newProfessor));
                return true;
        }
        return false;
    }   
}