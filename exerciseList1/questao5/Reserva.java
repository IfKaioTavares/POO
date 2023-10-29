package exerciseList1.questao5;

import exerciseList1.questao5.enums.QuartoCategorias;

public class Reserva {
    private Hotel hotel;
    private QuartoCategorias category;
    private Data checkIn;
    private Data checkOut;

    public Reserva(Hotel hotel, QuartoCategorias category, Data checkIn, Data checkOut){
        this.hotel = hotel;
        this.category = category;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public double pricePerNight(){

    }

}
