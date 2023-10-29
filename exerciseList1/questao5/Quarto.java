package exerciseList1.questao5;
import exerciseList1.questao5.enums.QuartoCategorias;

import java.util.Objects;

public class Quarto {
    private QuartoCategorias category;
    private double pricePerNight;
    private boolean availabe;
    private int number;
    public Quarto(int number,QuartoCategorias category, double pricePerNight){
        this.number = number;
        this.category = category;
        this.pricePerNight = pricePerNight;
        this.availabe = true;
    }

    public int getNumber() {
        return number;
    }

    public QuartoCategorias getCategory() {
        return category;
    }
    public double getPricePerNight() {
        return pricePerNight;
    }
    public boolean isAvailabe() {
        return availabe;
    }

    public void bookRoom(){
        this.availabe = false;
    }

    public void releaseRoom(){
        this.availabe = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quarto quarto = (Quarto) o;
        return Double.compare(pricePerNight, quarto.pricePerNight) == 0 && number == quarto.number && category == quarto.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, pricePerNight, number);
    }
}
