package exerciseList1.questao1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Biblioteca IFBA = new Biblioteca();
        String bookName = "Estrutur de Dados";
        String authorName = "Luiz Szwarcfiter";
        String[] categorysName =  {"Estrutura de Dados", "Programação, Algoritmos"};
        Autor author = IFBA.obterAuthor(authorName);
        ArrayList<Categoria> categories = IFBA.addReturnCategorys(categorysName);        
        Livro l1 = new Livro(bookName, author, categories);

        IFBA.addBook(l1);

        IFBA.addBook(
            new Livro("Cronicas de gelo e fogo", 
                      IFBA.obterAuthor("RR Martin"), 
                      IFBA.addReturnCategorys(new String[]{"Fantasia, Medieval"})));
        //IFBA.addBook("Harry Potter", "Alguem",  "Fantasia");
        System.out.println();
        //IFBA.addBook("Qualquer um", "Luiz Szwarcfiter", "POO");

        IFBA.findBooksByCategory("Fantasia");
        System.out.println(IFBA.findBooksByAuthor("Luiz Szwarcfiter"));
    }
}