package DAL;


public class Cliente extends Utilizador {

    private String nome;
    private int nTelemovel;

    
    public Cliente(String email, String password, String nome, int nTelemovel) {
        super( email, password);
        this.nome = nome;
        this.nTelemovel= nTelemovel;
    }

    public int getnTelemovel() {
        return nTelemovel;
    }

    public void setnTelemovel(int nTelemovel) {
        this.nTelemovel = nTelemovel;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
