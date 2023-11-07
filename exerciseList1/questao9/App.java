package exerciseList1.questao9;
import exerciseList1.questao9.enums.EventType;
import java.time.LocalDate;
import java.util.List;


public class App {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager("Gestão de Eventos");

        Evento evento1 = new Evento("Casamento A", EventType.CASAMENTO, LocalDate.of(2023, 11, 15));
        Evento evento2 = new Evento("Aniversário B", EventType.ANIVERSARIO, LocalDate.of(2023, 12, 5));
        Convidado convidado1 = new Convidado("Nome1", "Endereço1", "Telefone1");
        Convidado convidado2 = new Convidado("Nome2", "Endereço2", "Telefone2");

        eventManager.addEvento(evento1);
        evento1.addConvidado(convidado1);
        evento1.addConvidado(convidado2);
        eventManager.addEvento(evento2);
        evento2.addConvidado(convidado1);

        List<LocalDate> datasEventos = eventManager.datasEventos();
        System.out.println("Datas dos eventos cadastrados: " + datasEventos);
        System.out.println(evento1);
    }
}
