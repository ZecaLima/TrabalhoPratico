package DAL;


import java.io.Serializable;

public class Admin extends Utilizador implements Serializable {

    public Admin(String email, String password) {
        super(email, password);
    }

}
