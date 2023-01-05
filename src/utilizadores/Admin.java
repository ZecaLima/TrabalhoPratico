package Utilizadores;


import java.io.Serializable;

public class Admin extends Utilizador implements Serializable {

    public Admin(String tpUser, String nome, String password) {
        super(nome, tpUser, password);
    }

}
