package exerciseList1.questao6;

import exerciseList1.questao6.enums.Status;

public class App {
    public static void main(String[] args) {
        Employee e1 = new Employee("Kaio Tavares", 21);
        Employee e2 = new Employee("Matheus Sande", 25);
        Employee e3 = new Employee("Junio Sande", 19);
        Project gasMobile = new Project("Pedido gas app");
        Task task1 = new Task("Documentação do projeto", Status.DONE);
        Task task2 = new Task("Back-end", Status.DOING);
        Task task3 = new Task("Orçamento", Status.DONE);
        Task task4 = new Task("Testar aplicação", Status.TODO);
        task1.addResponsible(e1);
        task1.addResponsible(e2);
        task2.addResponsible(e1);
        task3.addResponsible(e1);
        task3.addResponsible(e2);
        task3.addResponsible(e3);
        task4.addResponsible(e1);
        task4.addResponsible(e2);
        task4.addResponsible(e3);
        gasMobile.addTask(task1);
        gasMobile.addTask(task1);
        gasMobile.addTask(task2);
        gasMobile.addTask(task3);
        gasMobile.addTask(task4);
        System.out.println(gasMobile.progress());
        System.out.println(task2.getResponsibles());
        System.out.println(task4.getResponsibles());
    }
}
