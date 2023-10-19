package exerciseList1.questao1;

import java.util.Objects;

public class Categoria {
    String name;

    public Categoria(String name) {
        this.name = name.toUpperCase();
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(this.name, categoria.name);
    }

}
