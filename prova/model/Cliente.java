package prova.model;

import java.util.Objects;

public class Cliente {
    String nome;
    String telefone;

    public Cliente(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public OrdemServico criarOrdemServico(Equipamento equipamento){
        return new OrdemServico(this, equipamento);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nome, cliente.nome) && Objects.equals(telefone, cliente.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, telefone);
    }
}
