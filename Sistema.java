package br.com.poo.Aplicativo;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Sistema {
    String nomeSistema;

    ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();

    public void adicionarInfo(Usuario dado) {
        listaUsuarios.add(dado);
    }

    ArrayList<Amigo> listaAmigos = new ArrayList<Amigo>();

    public void adicionarNome(Amigo nomeAmigo) {
        listaAmigos.add(nomeAmigo);
    }


    public void imprimirLista() {
        String nomesAmigos = "";

        for(int i=0; i<listaAmigos.size();i++) {
            Amigo amigo = (Amigo)listaAmigos.get(i);
            nomesAmigos+= "/n" + amigo.nomeAmigo;
        }

        JOptionPane.showMessageDialog(null, nomesAmigos, " Consultar ", JOptionPane.DEFAULT_OPTION);
    }
}