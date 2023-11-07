package exerciseList1.questao5.enums;

public enum QuartoCategorias {
    PADRAO(150), SUITE(200), LUXO(250), MASTER(300);
    private final int preco;
    QuartoCategorias(int preco){
        this.preco = preco;
    }
    public int getPreco() {
        return preco;
    }
}
