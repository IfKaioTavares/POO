package exerciseList1.questao10.src.model;

import java.util.ArrayList;
import java.util.List;

public class Comentario {
    private Perfil perfil;
    private String conteudo;
    private List<Comentario> comentarios;

    public Comentario(Perfil perfil, String conteudo){
        this.perfil = perfil;
        this.conteudo = conteudo;
        this.comentarios = new ArrayList<>();
    }
}
