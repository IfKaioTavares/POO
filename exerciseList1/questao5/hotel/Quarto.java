package exerciseList1.questao5.hotel;

import exerciseList1.questao5.enums.QuartoCategorias;
import exerciseList1.questao5.hotel.Hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Quarto {
    private int numero;
    private QuartoCategorias categoria;
    private ArrayList<LocalDate> chekIns;
    private ArrayList<LocalDate> chekOuts;

    public Quarto(Hotel hotel, int numero, QuartoCategorias categoria){
        this.numero = numero;
        this.categoria = categoria;
        this.chekIns = new ArrayList<>();
        this.chekOuts = new ArrayList<>();
        hotel.addQuarto(this);

    }
    public int getNumero() {
        return numero;
    }
    protected void reserva(LocalDate chekIn, LocalDate chekOut){
        this.chekIns.add(chekIn);
        this.chekOuts.add(chekOut);
    }

    //metodo com verificação n válida
    public boolean disponibilidade(LocalDate chekIn, LocalDate chekOut) {
        LocalDate checkInExistente;
        LocalDate checkOutExistente;
        for (int i = 0; i < this.chekIns.size(); i++) {
            checkInExistente = this.chekIns.get(i);
            checkOutExistente = this.chekOuts.get(i);
            if(!(chekOut.isBefore(checkInExistente) || chekIn.isAfter(checkOutExistente))){
                return false;
            }
        }
        return true;
    }
//chekIn.isEqual(checkInExistente) ||
//              (chekIn.isAfter(checkInExistente) && chekIn.isBefore(checkOutExistente)) ||
//              (chekOut.isAfter(checkInExistente) && chekOut.isBefore(checkOutExistente))){
    public List<LocalDate> getChekIns() {
        return List.copyOf(this.chekIns);
    }

    public List<LocalDate> getChekOuts() {
        return List.copyOf(this.chekOuts);
    }

    public QuartoCategorias getCategoria() {
        return categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quarto quarto = (Quarto) o;
        return numero == quarto.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "numero=" + numero +
                ", categoria=" + categoria +
                '}';
    }
}
