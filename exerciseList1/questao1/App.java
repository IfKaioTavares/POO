package exerciseList1.questao1;

public class App {

    public static void main(String[] args) {
        Autor a1 = new Autor("J.K. Rowling");
        Livro livro1 = new Livro("Harry Potter e a Pedra Filosofal", a1, new String[]{"Fantasia", "Aventura"});
        Livro livro2 = new Livro("Harry Potter e a Câmara Secreta", a1, new String[]{"Fantasia", "Mistério"});
        Livro livro3 = new Livro("Harry Potter e o Prisioneiro de Azkaban", a1, new String[]{"Fantasia", "Ação"});
        Autor a2 = new Autor("Kaio tavares");
        Livro livro4 = new Livro("Teorias doidas", a2, "Sla");
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.addNewBook(livro1);
        biblioteca.addNewBook(livro2);
        biblioteca.addNewBook(livro3);
        biblioteca.addNewBook(livro4);
        System.out.println(biblioteca.findBooksByAuthor(a1));
        System.out.println(biblioteca.findBooksByCategory("Mistério"));
    }


}