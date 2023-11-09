package prova.model;

import java.util.Objects;

public class Equipamento {
    private String nome;
    private String codigo;

    public Equipamento(String nome, String codigo){
        this.nome = nome;
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipamento that = (Equipamento) o;
        return Objects.equals(nome, that.nome) && Objects.equals(codigo, that.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, codigo);
    }
}
