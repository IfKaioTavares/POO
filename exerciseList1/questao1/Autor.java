package exerciseList1.questao1;

import java.util.ArrayList;
import java.util.Objects;

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
        if(!(bookList.contains(book))){
            this.bookList.add(book);
        }
    }

    public ArrayList<Livro> getBookList() {
        return bookList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Autor autor = (Autor) o;
        return Objects.equals(this.name, autor.name);
    }

}
