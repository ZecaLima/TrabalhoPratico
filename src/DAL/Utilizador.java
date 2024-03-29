package DAL;

import java.io.Serializable;
import java.util.UUID;

public class Utilizador implements Serializable {

    private String id;
    private String email;
    private String password;
    private String nome;
    private int nTelemovel;

    public Utilizador(String email, String password) {
        this.id = UUID.randomUUID().toString();
        this.email = email;
        this.password = password;
    }

    public Utilizador(){}

    public String getId() {
        return id;
    }

    public void setEmail(String username) {
        this.email = username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnTelemovel() {
        return nTelemovel;
    }

    public void setnTelemovel(int nTelemovel) {
        this.nTelemovel = nTelemovel;
    }

}
