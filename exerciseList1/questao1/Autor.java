package exerciseList1.questao1;

import java.util.ArrayList;

public class Autor {
    private String name;
    private ArrayList<Livro> bookList;


    public Autor(String name){
        this.name = name.toUpperCase();
        this.bookList = new ArrayList<Livro>();
    }

    public String getName() {
        return name;
    }

    public void addBook(Livro book){
        this.bookList.add(book);
    }

    public ArrayList<Livro> getBookList() {
        return bookList;
    }
}
