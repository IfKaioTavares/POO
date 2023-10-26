package exerciseList1.questao3;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Loja {
    private final String name;
    private final ArrayList<Departamento> listaDepartamento = new ArrayList<Departamento>();
    private final ArrayList<Produto> carrinho = new ArrayList<Produto>();
    public Loja(String name) {
        this.name = name;
    }
    public void addDepartamento(Departamento newDepartamento){
        if(!this.listaDepartamento.contains(newDepartamento)){
            this.listaDepartamento.add(newDepartamento);
        }
    }
    public void addProdutoCarrinho(Produto produto){
        if(this.listaDepartamento.contains((produto.getDepartamento()))){
            this.carrinho.add(produto);
        }
    }
    public void removerProdutoCarrinho(Produto produto){
        this.carrinho.remove(produto);
    }
    public List<Produto> getCarrinho() {
        return Collections.unmodifiableList(this.carrinho);
    }

    public float totalCompras(){
        float total = 0;
        for(Produto p: this.carrinho){
            total += p.getPreco();
        }
        return  total;
    }

    public void finalizarCompras(){
        this.carrinho.clear();
    }
}
