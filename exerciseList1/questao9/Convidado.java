package exerciseList1.questao9;

import java.util.Objects;

public class Convidado {
    private String name;
    private String address;
    private String phoneNumber;

    public Convidado(String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return Objects.equals(name, convidado.name) && Objects.equals(address, convidado.address) && Objects.equals(phoneNumber, convidado.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, phoneNumber);
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
