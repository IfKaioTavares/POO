package exerciseList1.questao8;

import java.time.LocalDateTime;
import java.util.Objects;

public class Patient{
    private String name;
    private int age;

    public Patient(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void makeAppointment(Hospital hospital, Appointment appointment ){
        if(appointment.getTime().isAfter(LocalDateTime.now())){
            hospital.makeAppointment(appointment);
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return age == patient.age && Objects.equals(name, patient.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
