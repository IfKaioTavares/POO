package exerciseList1.questao5;

import exerciseList1.questao5.enums.QuartoCategorias;
import exerciseList1.questao5.hotel.Hotel;
import exerciseList1.questao5.hotel.Quarto;

import java.time.LocalDate;

public class app {
    public static void main(String[] args) {
        Hotel h1 = new Hotel("Paradise");
        Quarto q1 = new Quarto(h1, 13, QuartoCategorias.PADRAO);
        Quarto q2 = new Quarto(h1, 14, QuartoCategorias.LUXO);
        Quarto q3 = new Quarto(h1, 13, QuartoCategorias.SUITE);
        Quarto q4 = new Quarto(h1, 15, QuartoCategorias.SUITE);

        System.out.println(h1.reserva(q4, LocalDate.of(2023,11,16), LocalDate.of(2023,11,20)));
        System.out.println(h1.reserva(q4, LocalDate.of(2023,11,14), LocalDate.of(2023,11,16)));
        System.out.println(h1.reserva(q2, LocalDate.of(2023,12,1), LocalDate.of(2023,12,8)));
        System.out.println(h1.reserva(q2, LocalDate.of(2023,12,1), LocalDate.of(2023,12,8)));
        System.out.println(h1.reserva(q1, LocalDate.of(2023,12,12), LocalDate.of(2023,12,24)));

        System.out.println(h1.disponibilidadeQuartos(LocalDate.of(2023,12,13), LocalDate.of(2023,12,23)));
    }
}
