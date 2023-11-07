package exerciseList1.questao9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private String name;
    private ArrayList<Evento> eventos;

    public EventManager(String name){
        this.name = name;
        this.eventos = new ArrayList<>();
    }
    public void addEvento(Evento newEvento){
        if(!this.eventos.contains(newEvento)){
            for(Evento e: this.eventos){
                if(e.getDate().isEqual(newEvento.getDate())){
                    return;
                }
            }
            this.eventos.add(newEvento);
        }
    }

    public List<LocalDate> datasEventos(){
        ArrayList<LocalDate> dates = new ArrayList<>();
        for (Evento e: this.eventos){
            dates.add(e.getDate());
        }
        return List.copyOf(dates);
    }
}
