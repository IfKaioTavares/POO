package exerciseList1.questao2;

public class Main {
    public static void main(String[] args) {
        Escola e1 = new Escola("Montessori");
        Turma t1 = new Turma("Quimica 1ano");
        Turma t2 = new Turma("Fisica 1ano");
        e1.addClass(t1);
        e1.addClass(t2);
        Aluno a1 = new Aluno("Kaio");
        Aluno a2 = new Aluno("Quersia");
        Professor p1 = new Professor("Kesio");
        Professor p2 = new Professor("Jovenzinho");
        Professor p3 = new Professor("Eduardo");
        Professor p4 = new Professor("Ramon");
        t1.addTeacher(p1);
        t1.addTeacher(p2);
        t1.addStudent(a1);
        t1.addStudent(a2);
        t2.addTeacher(p3);
        t2.addTeacher(p4);
        t2.addTeacher(p1);
        t2.addStudent(a1);
        System.out.println(e1.findClassesByTeacher(p1));
        System.out.println(e1.findStudentsByClass(t2));
    }
}
