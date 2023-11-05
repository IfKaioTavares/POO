package exerciseList1.questao8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Doctor {
    private String name;
    private String cpf;
    private String speciality;
    private ArrayList<Appointment> appointments;

    public Doctor(String name, String cpf, String speciality) {
        this.name = name;
        this.cpf = cpf;
        this.speciality = speciality;
        this.appointments = new ArrayList<>();
    }

    public List<Appointment> getAppointments() {
        return  List.copyOf(appointments);
    }

    public void addAppointment(Appointment newAppointment){
        this.appointments.add(newAppointment);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(name, doctor.name) && Objects.equals(cpf, doctor.cpf) && Objects.equals(speciality, doctor.speciality) && Objects.equals(appointments, doctor.appointments);
    }
}
