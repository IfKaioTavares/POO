package exerciseList1.questao1;

import java.util.ArrayList;
import java.util.Objects;

public class Autor {
    private String athorName;
    private ArrayList<Livro> authorBookList = new ArrayList<Livro>();

    public Autor(String authorName){
        this.athorName = authorName.toUpperCase();
    }

    public void addBook(Livro newBook){
        if(!this.authorBookList.contains(newBook)){
            this.authorBookList.add(newBook);
        }
    }
    public String getAthorName() {
        return athorName;
    }

    public ArrayList<Livro> getAuthorBookList() {
        return authorBookList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Autor autor)) return false;
        return Objects.equals(this.getAthorName(), autor.getAthorName()) && Objects.equals(this.getAuthorBookList(),
                autor.getAuthorBookList());
    }

    @Override
    public String toString() {
        return "Autor{" +
                "athorName='" + athorName + '\'' +
                '}';
    }
}
