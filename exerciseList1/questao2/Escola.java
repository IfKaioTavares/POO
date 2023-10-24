package exerciseList1.questao2;
import java.util.ArrayList;
import java.util.Objects;

public class Escola {
    private String name;
    private String id;
    private ArrayList<Turma> classList = new ArrayList<Turma>();

    public Escola(String schoolName, String id){
        this.name = schoolName;
        this.id = id;
    }
    public void addClass(Turma newClass){
        if(!this.classList.contains(newClass)){
            this.classList.add(newClass);
        }
    }
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }

    public ArrayList<Turma> findClassesByTeacher(Professor teacher){
        for (Turma turma: this.classList){
            for (Professor professor: turma.getTeachersList()){
                if(professor.equals(teacher)){
                    return teacher.getClassList();
                }
            }
        }
        return null;
    }

    public ArrayList<Aluno> findStudentsByClass(Turma turma){
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
        if (!(o instanceof Escola escola)) return false;
        return Objects.equals(getName(), escola.getName()) && Objects.equals(getId(), escola.getId());
    }
}
