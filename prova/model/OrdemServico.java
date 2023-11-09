package prova.model;

import java.time.Duration;
import java.time.LocalDateTime;
import prova.enums.Status;

public class OrdemServico {
    private Cliente cliente;
    private Equipamento equipamento;
    private LocalDateTime inicioServico;
    private LocalDateTime fimServico;
    private Tecnico tecnico;
    private Status status;

    public OrdemServico(Cliente cliente, Equipamento equipamento){
        this.cliente = cliente;
        this.equipamento = equipamento; 
        this.inicioServico = LocalDateTime.now();
        this.status = Status.EM_ANDAMENTO;
    }

    public void addTecnico(Tecnico tecnico){
        this.tecnico = tecnico;
    }

    public void finalizarServico(LocalDateTime fimServico){
        this.fimServico = fimServico;
        this.status = Status.FINALIZADO;
    }

    public boolean atrasado(){
        return Duration.between(inicioServico, fimServico).toHours() >= 72;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public Status getStatus() {
        return status;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    @Override
    public String toString() {
        return "OrdemServico{" +
                "cliente=" + cliente +
                ", equipamento=" + equipamento +
                ", inicioServico=" + inicioServico +
                ", fimServico=" + fimServico +
                ", tecnico=" + tecnico +
                ", status=" + status +
                ", atraso=" + this.atrasado() +
                '}';
    }
}
