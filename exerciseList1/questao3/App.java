package exerciseList1.questao3;

public class App {
    public static void main(String[] args) {
        Loja Loja1 = new Loja("Pernambucanas");
        
        Departamento d1 = new Departamento("Masculino");
        Departamento d2 = new Departamento("Feminino");
        Departamento d3 = new Departamento("Kids");
        
        Produto p1 = new Produto("Camisa Polo", 120, "M", "Preto",d2);
        p1.setDepartamento(d1);
        Produto p2 = new Produto("Calça jeans", 240, "G", "Azul Claro",d1);
        Produto p3 = new Produto("Croped", 40, "P", "Preto",d2);
        Produto p4 = new Produto("Saia", 200, "G", "Vermelho",d2);
        Produto p5 = new Produto("Bone BabyShark", 120, "P", "Preto",d3);
        Produto p6 = new Produto("Camisa Galinha Pintada", 30, "M", "Amarelo",d3);

        Loja1.addDepartamento(d1);
        Loja1.addDepartamento(d2);
        Loja1.addDepartamento(d3);

        Loja1.addProdutoCarrinho(p1);
        Loja1.addProdutoCarrinho(p3);
        Loja1.addProdutoCarrinho(p6);

        System.out.println(Loja1.getCarrinho());
        System.out.println(Loja1.totalCompras());
        Loja1.removerProdutoCarrinho(p4);
        Loja1.removerProdutoCarrinho(p1);
        System.out.println(Loja1.getCarrinho());
        System.out.println(Loja1.totalCompras());
        System.out.println(d2.getListaProdutos());
        Loja1.finalizarCompras();
        Loja1.addProdutoCarrinho(p1);
        Loja1.addProdutoCarrinho(p3);
        Loja1.addProdutoCarrinho(p6);
        Loja1.addProdutoCarrinho(p2);
        Loja1.addProdutoCarrinho(p4);
        Loja1.addProdutoCarrinho(p5);
        System.out.println(Loja1.getCarrinho());
        System.out.println(Loja1.totalCompras());
    }
}
