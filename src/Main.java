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
        
        
        File file2 = new File("carros.dat");        
        if (!file2.exists()) {
            try {
                file2.createNewFile();
                System.out.println("Ficheiro criado com sucesso.");
            } catch (IOException e) {
                System.out.println("Erro ao criar o ficheiro: " + e.getMessage());
            }
        } else {
            System.out.println("File already exists.");
        }
        
        
        File file3 = new File("reservas.dat");        
        if (!file3.exists()) {
            try {
                file3.createNewFile();
                System.out.println("Ficheiro criado com sucesso.");
            } catch (IOException e) {
                System.out.println("Erro ao criar o ficheiro: " + e.getMessage());
            }
        } else {
            System.out.println("File already exists.");
        }
        
        
        File file4 = new File("vendas.dat");        
        if (!file4.exists()) {
            try {
                file4.createNewFile();
                System.out.println("Ficheiro criado com sucesso.");
            } catch (IOException e) {
                System.out.println("Erro ao criar o ficheiro: " + e.getMessage());
            }
        } else {
            System.out.println("File already exists.");
        }
        
        
        new Login().setVisible(true);
        
        
    }
}