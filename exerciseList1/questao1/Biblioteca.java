package exerciseList1.questao1;

import java.util.ArrayList;
public class Biblioteca {
    private ArrayList<Livro> bookList;
    private ArrayList<Autor> authorList;
    private ArrayList<Categoria> categoryList;

    public Biblioteca(){
        this.bookList = new ArrayList<Livro>();
        this.authorList = new ArrayList<Autor>();
        this.categoryList = new ArrayList<Categoria>();
    }
    public void addBook(Livro newBook) {
        if(!(bookList.contains(newBook))){
            this.bookList.add(newBook);
        }
    }

    public ArrayList<Categoria> addReturnCategorys(String[] categorys){
        ArrayList<Categoria> bookCategorysConverted = new ArrayList<Categoria>();
        for(String category : categorys){
            Categoria newCategory = new Categoria(category);
            if(categoryList.contains(newCategory)){
                bookCategorysConverted.add(categoryList.get(categoryList.indexOf(newCategory)));
            }else{
                bookCategorysConverted.add(newCategory);                
            }
        }

        return bookCategorysConverted;
    }

    public ArrayList<Livro> findBooksByAuthor(String authorName){
        Autor autorBusca = new Autor(authorName);
        if(authorList.contains(autorBusca)){
            return authorList.get(authorList.indexOf(autorBusca)).getBookList();
        }
        ArrayList<Livro> listaRetorno = new ArrayList<>();
        for (Livro livro : bookList) {
            if(livro.getAuthor().equals(autorBusca)){
                listaRetorno.add(livro);
            }
        }
        return listaRetorno;
    }

    public ArrayList<Livro> findBooksByCategory(String categoryName){
        ArrayList<Livro> listaRetorno = new ArrayList<>();
        Categoria categoriaBusca = new Categoria(categoryName);
        for (Livro livro : bookList) {
            if(livro.getCategoryList().contains(categoriaBusca)){
                listaRetorno.add(livro);
            }
        }
        return listaRetorno;
    }
    public Autor obterAuthor(String authorName) {
        Autor novoAutor = new Autor(authorName);        
        if(authorList.contains(novoAutor)){
            return authorList.get(authorList.indexOf(novoAutor));
        }
        authorList.add(novoAutor);
        return novoAutor;
    }
}