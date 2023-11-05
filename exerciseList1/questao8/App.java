package exerciseList1.questao8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("Kaio Hospital");
        Doctor d1 = new Doctor("Raquel", "000", "Cardiologista");
        Doctor d2 = new Doctor("Kaio", "123", "Endocrinologista");
        Doctor d3 = new Doctor("Fulana", "456","Geral");

        h1.addDoctor(d1);
        h1.addDoctor(d2);
        h1.addDoctor(d3);

        Patient p1 = new Patient("Beltanio", 19);
        Patient p2 = new Patient("Fulsnk", 56);
        Patient p3 = new Patient("Fasajksajs", 45);
        Patient p4 = new Patient("dasoljdka", 34);

        LocalDateTime dt1 = LocalDateTime.of(2023,11,6,8,0);
        LocalDateTime dt2 = LocalDateTime.of(2023,11,6,8,30);
        LocalDateTime dt3 = LocalDateTime.of(2023,11,6,7, 40);
        LocalDateTime dt4 = LocalDateTime.of(2023,11,14,8,0);

        Appointment a1 = new Appointment(d1, p1, dt1, "Ataque Cardiaco");
        Appointment a2 = new Appointment(d1, p2, dt2, "Veia entupida");
        Appointment a3 = new Appointment(d1, p3, dt3, "Ataque Cardiaco");
        Appointment a4 = new Appointment(d1, p4, dt4, "Veia entupida");

        Appointment a5 = new Appointment(d2, p2, dt1, "Tomar Bomba");
        Appointment a6 = new Appointment(d3, p1, dt3, "Raio X");
        Appointment a7 = new Appointment(d1, p3, dt1, "Ataque Cardiaco");
        Appointment a8 = new Appointment(d1, p4, dt2, "Veia entupida");

        p1.makeAppointment(h1, a1);
        p1.makeAppointment(h1, a6);

        p2.makeAppointment(h1, a2);
        p2.makeAppointment(h1, a5);

        p3.makeAppointment(h1, a3);
        p3.makeAppointment(h1, a7);

        p4.makeAppointment(h1, a4);
        p4.makeAppointment(h1, a8);

        //System.out.println(h1.patientAppointments(p1));
        //System.out.println(h1.patientAppointments(p2));
        //System.out.println(h1.patientAppointments(p3));
        //System.out.println(h1.patientAppointments(p4));

        System.out.println(h1.doctorShedule(d1));
        System.out.println(h1.doctorShedule(d2));
        System.out.println(h1.doctorShedule(d3));


    }
}
