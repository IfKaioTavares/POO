package prova;

import java.util.ArrayList;
import java.util.List;

import prova.enums.Status;
import prova.model.Cliente;
import prova.model.Equipamento;
import prova.model.OrdemServico;
import prova.model.Tecnico;

public class Main {
    private ArrayList <OrdemServico> ordensServico;

    public Main(){
        this.ordensServico = new ArrayList<>();
    }

    public void addOrdemServico(Cliente cliente, Equipamento equipamento, Tecnico tecnico){
        OrdemServico novaOs = cliente.criarOrdemServico(equipamento);
        novaOs.addTecnico(tecnico);
        if(!this.ordensServico.contains(novaOs)){
            this.ordensServico.add(novaOs);
        }
    }

    public List<OrdemServico> ordemServicoEquipamento(Cliente cliente, Equipamento equipamento){
        ArrayList<OrdemServico> osEquipamento = new ArrayList<>();
        for(OrdemServico os: this.ordensServico){
            if(os.getCliente().equals(cliente) && os.getStatus().equals(Status.EM_ANDAMENTO) && os.getEquipamento().equals(equipamento)){
                osEquipamento.add(os);
            }
        }
        return List.copyOf(osEquipamento);
    }

    public List<OrdemServico> ordemServicoTecnico(Cliente cliente, Tecnico tecnico){
        ArrayList<OrdemServico> osTecnico = new ArrayList<>();
        for(OrdemServico os: this.ordensServico){
            if(os.getCliente().equals(cliente) && os.getStatus().equals(Status.EM_ANDAMENTO) && os.getTecnico().equals(tecnico)){
                osTecnico.add(os);
            }
        }
        return List.copyOf(osTecnico);
    }

    public List<OrdemServico> ordemServicoAtrasado(){
        ArrayList<OrdemServico> osAtrasado = new ArrayList<>();
        for(OrdemServico os: this.ordensServico){
            if(os.atrasado()){
                osAtrasado.add(os);
            }
        }
        return List.copyOf(osAtrasado);
    }


}
