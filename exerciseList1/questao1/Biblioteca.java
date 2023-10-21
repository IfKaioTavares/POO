package exerciseList1.questao1;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> bookList = new ArrayList<Livro>();

    public Biblioteca(){};

    public void addNewBook(Livro newLivro){
        if(!this.bookList.contains(newLivro)){
            this.bookList.add(newLivro);
        }
    }

    public ArrayList<Livro> findBooksByAuthor(Autor author){
        for (Livro book: this.bookList){
            if(book.getAuthor().equals(author)){
                return book.getAuthor().getAuthorBookList();
            }
        }
        return null;
    }

    public ArrayList<Livro> findBooksByCategory(String categoryName){
        ArrayList<Livro> bookListToReturn = new ArrayList<Livro>();
        for(Livro book: this.bookList){
            for(String category: book.getCategorysList()){
                if(category.equals(categoryName.toUpperCase())){
                    bookListToReturn.add(book);
                }
            }
        }
        return bookListToReturn;
    }
}
