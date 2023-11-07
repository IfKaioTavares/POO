package exerciseList1.questao9;

import exerciseList1.questao9.enums.EventType;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Evento {
    private String name;
    private EventType type;
    private ArrayList<Convidado> convidadosList;
    private ArrayList<String> atividades;
    private LocalDate date;
    public Evento(String name, EventType type, LocalDate date){
        this.name = name;
        this.type = type;
        this.date = date;
        this.convidadosList = new ArrayList<>();
        this.atividades = new ArrayList<>();
    }
    public void addConvidado(Convidado newConvidado){
        if(!this.convidadosList.contains(newConvidado)){
            this.convidadosList.add(newConvidado);
        }
    }
    public void addAtividades(String[] atividades){
        for(String atividade: atividades){
            if(!this.atividades.contains(atividade)){
                this.atividades.add(atividade);
            }
        }
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return LocalDate.of(this.date.getYear(), this.date.getMonth(), this.date.getDayOfMonth());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Evento evento = (Evento) o;
        return Objects.equals(name, evento.name) && type == evento.type && Objects.equals(convidadosList, evento.convidadosList) && Objects.equals(atividades, evento.atividades) && Objects.equals(date, evento.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, convidadosList, atividades, date);
    }

    @Override
    public String toString() {
        return "Evento{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", convidadosList=" + convidadosList +
                ", atividades=" + atividades +
                ", date=" + date +
                '}';
    }
}
