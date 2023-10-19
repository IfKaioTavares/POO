package exerciseList1.questao1;

public class App {
    public static void main(String[] args) {
        Biblioteca IFBA = new Biblioteca();
        IFBA.addBook("Estrutur de Dados", "Luiz Szwarcfiter", "Estrutura de Dados, Programação, Algoritmos");
        IFBA.addBook("Cronicas de gelo e fogo", "RR Martin", "Fantasia, Medieval");
        IFBA.addBook("Harry Potter", "Alguem",  "Fantasia");
        System.out.println();
        IFBA.addBook("Qualquer um", "Luiz Szwarcfiter", "POO");

        IFBA.findBooksByCategory("Fantasia");
        System.out.println(IFBA.findBooksByAuthor("Luiz Szwarcfiter"));
    }
}