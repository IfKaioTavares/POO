package exerciseList1.questao8;

import java.time.LocalDateTime;
import java.util.Objects;

public class Appointment {
    private Doctor doctor;
    private Patient patient;
    private LocalDateTime time;
    private String reason;

    public Appointment(Doctor doctor, Patient patient, LocalDateTime time, String reason){
        this.doctor = doctor;
        this.patient = patient;
        this.time = time;
        this.reason = reason;
    }

    public LocalDateTime getTime() {
        return LocalDateTime.from(this.time);
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public String appointmentDetails(){
        return "Paciente: " + patient.getName() +
                "\nDoutor: " + doctor.getName() +
                "\nMotivo: " + reason +
                "\nHorário: " + time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return Objects.equals(doctor, that.doctor) && Objects.equals(patient, that.patient) && Objects.equals(time, that.time) && Objects.equals(reason, that.reason);
    }

    @Override
    public String toString() {
        return this.appointmentDetails();
    }
}
