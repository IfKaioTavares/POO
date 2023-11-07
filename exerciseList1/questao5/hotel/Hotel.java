package exerciseList1.questao5.hotel;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nome;
    private ArrayList<Quarto> quartos;

    public Hotel(String nome){
        this.nome = nome;
        this.quartos = new ArrayList<>();
    }

    public void addQuarto(Quarto novoQuarto){
        if(!this.quartos.contains(novoQuarto)){
            this.quartos.add(novoQuarto);
        }
    }

    public double reserva(Quarto quarto,LocalDate chekIn, LocalDate chekOut){
        if(this.quartos.contains(quarto)){
            if(quarto.disponibilidade(chekIn, chekOut)){
                quarto.reserva(chekIn, chekOut);
                return quarto.getCategoria().getPreco() * Period.between(chekIn, chekOut).getDays();
            }
        }
        return -1;
    }

    public List<Quarto> disponibilidadeQuartos(LocalDate chekIn, LocalDate chekOut){
        ArrayList<Quarto> quartosDisponiveis = new ArrayList<>();
        for(Quarto q: this.quartos){
            if(q.disponibilidade(chekIn, chekOut)){
                quartosDisponiveis.add(q);
            }
        }
        return List.copyOf(quartosDisponiveis);
    }
}
