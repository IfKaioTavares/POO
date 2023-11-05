package exerciseList1.questao8;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String hospitalName;
    private ArrayList<Doctor> doctors;
    private ArrayList<Appointment> appointments;
    private ArrayList<Patient> patients;

    public Hospital(String hospitalName){
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.appointments = new ArrayList<>();
        this.patients = new ArrayList<>();
    }
    public void addDoctor(Doctor doctor){
        if(!this.doctors.contains(doctor)){
            this.doctors.add(doctor);
        }
    }
    public void makeAppointment(Appointment appointment){
        if(this.doctors.contains(appointment.getDoctor())){
            for(Doctor d: this.doctors){
                if(d.equals(appointment.getDoctor())){
                    boolean validation = true;
                    for(Appointment a: d.getAppointments()){
                        //Verifica se os dias são iguais
                        if (a.getTime().getYear() == appointment.getTime().getYear() && a.getTime().getDayOfYear() == appointment.getTime().getDayOfYear()) {
                            //Verifica se existe uma diferença de 30 min
                            validation = compareAppointmentDate(a.getTime(), appointment.getTime());
                            if(!validation){return;}
                        }
                    }
                    this.appointments.add(appointment);
                    d.addAppointment(appointment);
                    if(!this.patients.contains(appointment.getPatient())){this.patients.add(appointment.getPatient());}
                    return;
                }
            }
        }
    }

    private boolean compareAppointmentDate(LocalDateTime lDT1, LocalDateTime lDT2){
        return Duration.between(lDT1, lDT2).abs().compareTo(Duration.ofMinutes(30)) >= 0;
    }

    public List<Appointment> patientAppointments(Patient patient){
        ArrayList<Appointment> patientAppointments = new ArrayList<>();
        if(this.patients.contains(patient)){
            for(Appointment a: this.appointments){
                if(a.getPatient().equals(patient)){
                    patientAppointments.add(a);
                }
            }
            return List.copyOf(patientAppointments);
        }
        return null;
    }

    public List<LocalDateTime> doctorShedule(Doctor doctor){
        ArrayList<LocalDateTime> shedule= new ArrayList<>();
        if(this.doctors.contains(doctor)){
            for(Appointment a: doctor.getAppointments()){
                shedule.add(a.getTime());
            }
            return List.copyOf(shedule);
        }
        return null;
    }

    public String appointmentDetails(Appointment appointment){
        if(this.appointments.contains(appointment)){
            return appointment.appointmentDetails();
        }
        return null;
    }
}
