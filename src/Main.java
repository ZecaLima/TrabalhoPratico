import DAL.*;
import UI.*;
import BLL.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        dados d = new dados();
        
        File file = new File("utilizador.dat");        
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("Ficheiro criado com sucesso.");
                Admin admin = new Admin("admin", "admin");        
                d.addUser(admin);
            } catch (IOException e) {
                System.out.println("Erro ao criar o ficheiro: " + e.getMessage());
            }
        } else {
            System.out.println("File already exists.");
        }
        
        
        
        ArrayList<Utilizador> users = d.getAllUsers();       
        for (Utilizador cenas : users) {
            System.out.println(cenas.getId()+ " - " + cenas.getEmail()+ " - " + cenas.getPassword());
        }

        
        new Login().setVisible(true);
        
        
    }
}