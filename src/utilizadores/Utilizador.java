package Utilizadores;

import java.io.Serializable;

public class Utilizador implements Serializable {

    private static int nUtilizador=0;

    private int id=0;
    private String username;
    private String password;
    private String nome;

    public Utilizador(String username, String nome, String password) {
        id = Utilizador.nUtilizador ++;
        this.username = username;
        this.nome = nome;
        this.password = password;
    }

    public Utilizador(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static int getnUtilizador() {
        return nUtilizador;
    }

    public static void setnUtilizador(int nUtilizador) {
        Utilizador.nUtilizador = nUtilizador;
    }



}
