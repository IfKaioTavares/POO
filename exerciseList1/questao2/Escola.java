package exerciseList1.questao2;
import java.util.ArrayList;
import java.util.Objects;
import java.util.List;

public class Escola {
    private String name;
    private ArrayList<Turma> classList = new ArrayList<Turma>();

    public Escola(String schoolName){
        this.name = schoolName;
    }
    public void addClass(Turma newClass){
        if(!this.classList.contains(newClass)){
            this.classList.add(newClass);
        }
    }
    public String getName() {
        return name;
    }

    public List<Turma> findClassesByTeacher(Professor teacher){
        for (Turma turma: this.classList){
            for (Professor professor: turma.getTeachersList()){
                if(professor.equals(teacher)){
                    return teacher.getClassList();
                }
            }
        }
        return null;
    }

    public List<Aluno> findStudentsByClass(Turma turma){
        for(Turma t: this.classList){
            if(t.equals(turma)){
                return  turma.getStudentsList();
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Escola escola = (Escola) o;
        return Objects.equals(name, escola.name) && Objects.equals(classList, escola.classList);
    }

}
