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
    public void addBook(String bookName, String authorName, String categorysName) {
        if(!bookExist(bookName)) {
            Autor author = addReturnAuthor(authorName);
            ArrayList<Categoria> categories = addReturnCategorys(categorysName);
            Livro newBook = new Livro(bookName, author, categories);
            this.bookList.add(newBook);
            author.addBook(newBook);
        }else{
            Logger.error("Livro já existente");
        }
    }

    private boolean bookExist(String bookName) {
        for (Livro book : this.bookList) {
            if (book.getName().equals(bookName.toUpperCase())) {
                return true;
            }
        }
        return false;
    }

    public Livro findBook(String bookName) {
        for (Livro book : this.bookList) {
            if (book.getName().equals(bookName.toUpperCase())) {
                Logger.info("Livro encontrado");
                return book;
            }
        }
        Logger.error("Livro não existente");
        return null;
    }

    private boolean authorExist(String authorName) {
        for (Autor autor : this.authorList) {
            if (autor.getName().equals(authorName.toUpperCase())) {
                return true;
            }
        }
        return false;
    }



    private Autor addReturnAuthor(String authorName){
        if (!authorExist(authorName)) {
            Autor anyAutor = new Autor(authorName);
            Logger.warning("Autor criado automaticamente");
            this.authorList.add(anyAutor);
            return anyAutor;
        }
        for(Autor author: this.authorList){
            if(author.getName().equals(authorName.toUpperCase())){
                return author;
            }
        }
        return null;
    }

    private Boolean categoryExist(String categoryName) {
        for (Categoria category : this.categoryList) {
            if (category.getName().equals(categoryName.toUpperCase())) {
                return true;
            }
        }
        return false;
    }

    private ArrayList<Categoria> addReturnCategorys(String bookCategory){
        ArrayList<Categoria> bookCategorysConverted = new ArrayList<Categoria>();
        String[] categorys = bookCategory.split("(,|,\\s+)");
        for(String category : categorys){
            Categoria newCategory = new Categoria(category);
            if(!categoryExist(category)){
                Logger.warning("Categoria " +category+ " criada automaticamente");
                this.categoryList.add(newCategory);
                bookCategorysConverted.add(newCategory);
            }else{
                bookCategorysConverted.add(newCategory);
            }
        }

        return bookCategorysConverted;
    }

    public ArrayList<Livro> findBooksByAuthor(String authorName){
        if(authorExist(authorName)){
            for (Autor autor : this.authorList) {
                if(autor.getName().equals(authorName.toUpperCase())) {
                    for(Livro livro: autor.getBookList()){
                        Logger.info(livro.getName());
                    }
                    return autor.getBookList();
                }
            }
        }
        Logger.error("Livro com autor informado não existente no acervo");
        return null;
    }

    public ArrayList<Livro> findBooksByCategory(String categoryName){
        if(categoryExist(categoryName)){
            ArrayList<Livro> returnedBookList = new ArrayList<Livro>();
            for (Livro livro : this.bookList) {
                for(Categoria bookCategory: livro.getCategoryList()){
                    if(bookCategory.name.equals(categoryName.toUpperCase())){
                        returnedBookList.add(livro);
                    }
                }
            }
            for(Livro livro: returnedBookList){
                Logger.info(livro.getName());
            }
            return returnedBookList;
        }
        Logger.error("Livro com categoria informada não existente no acervo");
        return null;
    }
}