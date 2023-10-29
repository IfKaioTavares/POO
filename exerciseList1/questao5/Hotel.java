package exerciseList1.questao5;
import exerciseList1.questao5.enums.QuartoCategorias;
import java.util.ArrayList;
import java.util.Objects;
public class Hotel {
    private String name;
    private ArrayList<Quarto> roomsList;
    public Hotel(String name){
        this.name = name;
        this.roomsList = new ArrayList<>();
    }
    public void addRoom(int number, QuartoCategorias category, double pricePerNight){
        Quarto newRoom = new Quarto(number,category,pricePerNight);
        if(!this.roomsList.contains(newRoom)){
            this.roomsList.add(newRoom);
        }
    }
    public Quarto getRoom(int number){
        for (Quarto room: this.roomsList){
            if(Objects.equals(room.getNumber(),number)){
                return  room;
            }
        }
        return null;
    }

}
