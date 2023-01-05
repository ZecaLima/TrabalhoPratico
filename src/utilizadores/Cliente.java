package Utilizadores;


public class Cliente extends Utilizador {

    private String email;
    private int nTelemovel;

    public Cliente(String tpUser, String nome, String password) {
        super(tpUser, nome, password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getnTelemovel() {
        return nTelemovel;
    }

    public void setnTelemovel(int nTelemovel) {
        this.nTelemovel = nTelemovel;
    }
}
