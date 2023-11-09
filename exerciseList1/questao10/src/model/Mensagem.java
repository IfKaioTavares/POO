package exerciseList1.questao10.src.model;

import java.util.ArrayList;
import java.util.List;

public class Mensagem {
    private Perfil perfil;
    private int imagem; //codigo da imagem
    private String conteudo;
    private List<Comentario> comentarios;

    public Mensagem(Perfil perfil, int imagem){
        this.perfil = perfil;
        this.imagem = imagem;
        this.comentarios = new ArrayList<>();
    }

    public Mensagem(Perfil perfil, String conteudo){
        this.perfil = perfil;
        this.conteudo = conteudo;
        
    }

    public Mensagem (Perfil perfil, int imagem, String conteudo){
        this(perfil, imagem);
        this.conteudo = conteudo;
    }

    protected void addComentario(Comentario comentario){
        if(!this.comentarios.contains(comentario)){
            this.comentarios.add(comentario);
        }
    }

    public List<Comentario> getComentarios() {
        return List.copyOf(comentarios);
    }

}
