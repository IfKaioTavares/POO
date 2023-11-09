package prova.model;

import java.util.Objects;

public class Tecnico {
    String nome;
    String telefone;

    public Tecnico(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tecnico tecnico = (Tecnico) o;
        return Objects.equals(nome, tecnico.nome) && Objects.equals(telefone, tecnico.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, telefone);
    }
}
