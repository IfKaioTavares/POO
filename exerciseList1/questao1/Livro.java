package exerciseList1.questao1;

import java.util.ArrayList;
import java.util.Objects;

public class Livro {
    private String name;
    private Autor author;
    private ArrayList<Categoria> categoryList;

    public Livro(String name, Autor autor, ArrayList<Categoria> category){
        this.name = name.toUpperCase();
        this.author = autor;
        this.author.addBook(this);
        this.categoryList = new ArrayList<Categoria>();
        this.categoryList.addAll(category);
    }

    public String getName() {
        return name;
    }

    public Autor getAuthor() {
        return author;
    }

    public void addCategory(Categoria bookCategory){
        this.categoryList.add(bookCategory);
    }

    public ArrayList<Categoria> getCategoryList() {
        return categoryList;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Livro livro = (Livro) o;
        return Objects.equals(this.name, livro.name) && Objects.equals(this.author, livro.author);
    }
    
}
