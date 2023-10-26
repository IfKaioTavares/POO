package exerciseList1.questao2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Turma {
    private String name;
    private ArrayList<Aluno> studentsList = new ArrayList<Aluno>();
    private ArrayList<Professor> teachersList = new ArrayList<Professor>();

    public Turma(String className){
        this.name = className;
    }
    public void addStudent(Aluno newStudent){
        if(!this.studentsList.contains(newStudent)){
            this.studentsList.add(newStudent);
            newStudent.getInClass(this);
        }
    }
    public void addTeacher(Professor newTeacher){
        if(!this.teachersList.contains(newTeacher)){
            this.teachersList.add(newTeacher);
            newTeacher.getInClass(this);
        }
    }
    public String getName() {
        return name;
    }
    public List<Aluno> getStudentsList() {
        return Collections.unmodifiableList(studentsList);
    }
    public List<Professor> getTeachersList() {
        return Collections.unmodifiableList(teachersList);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Turma turma)) return false;
        return Objects.equals(getName(), turma.getName()) && Objects.equals(getStudentsList(), turma.getStudentsList()) && Objects.equals(getTeachersList(), turma.getTeachersList());
    }

    @Override
    public String toString() {
        return "Turma{" +
                "name='" + name + '\'' +
                ", studentsList=" + studentsList +
                ", teachersList=" + teachersList +
                '}';
    }
}
