package exerciseList1.questao10.src.model;

import java.util.ArrayList;
import java.util.List;

public class Perfil {
    private String name;
    private String senha;
    private List<Mensagem> mensagens;
    private List<Perfil> amigos;

    public Perfil(String name, String senha){
        this.name = name;
        this.senha = senha;
        this.mensagens = new ArrayList<>();
        this.amigos = new ArrayList<>();
    }

    public void addAmigo(Perfil amigo){
        if(!this.amigos.contains(amigo)){
            this.amigos.add(amigo);
        }
    }

    public void postarMensagem(Mensagem mensagem){
        if(!this.mensagens.contains(mensagem)){
            this.mensagens.add(mensagem);
        }
    }

    public void postarComentario(Mensagem mensagem, Comentario comentario){
        if(!mensagem.getComentarios().contains(comentario)){
            mensagem.addComentario(comentario);
        }   
    }

    public List<Mensagem> getMensagens() {
        return List.copyOf(mensagens);
    }

    
}