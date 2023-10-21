package exerciseList1.questao1;

import java.util.ArrayList;
import java.util.Objects;

public class Livro {
    private String bookName;
    private Autor author;
    private ArrayList<String> categorysList = new ArrayList<String>();

    public Livro(String bookName, Autor author, String bookCategory){
        this.bookName = bookName.toUpperCase();
        this.author = author;
        this.author.addBook(this);
        this.addNewCategory(bookCategory);
    }

    public Livro(String bookName, Autor author, String[] bookCategory){
        this.bookName = bookName.toUpperCase();
        this.author = author;
        this.author.addBook(this);
        this.addNewCategory(bookCategory);
    }
    public void addNewCategory(String newCategory){
        String fomatedCategory = newCategory.toUpperCase();
        if(!this.categorysList.contains(fomatedCategory)){
            this.categorysList.add(fomatedCategory);
        }
    }
    public void addNewCategory(String[] newCategorys){
        for(String newCategory: newCategorys){
            this.addNewCategory(newCategory);
        }
    }

    public String getBookName() {
        return bookName;
    }

    public Autor getAuthor() {
        return author;
    }

    public ArrayList<String> getCategorysList() {
        return categorysList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro livro)) return false;
        return Objects.equals(this.getBookName(), livro.getBookName()) && Objects.equals(this.getAuthor(),
                livro.getAuthor());
    }

    @Override
    public String toString() {
        return "Livro{" +
                "bookName='" + bookName + '\'' +
                ", author=" + author +
                ", categorysList=" + categorysList +
                '}';
    }
}
