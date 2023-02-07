/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author jcarl
 */
public class dados {
    public ArrayList<Utilizador> getAllUsers(){
        
        ArrayList<Utilizador> users = new ArrayList<>();        
        
        try (FileInputStream fis = new FileInputStream("utilizador.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            users = (ArrayList<Utilizador>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
                
        return users;
    }
    
    public void addUser(Utilizador user){
        
        ArrayList<Utilizador> users = getAllUsers();
        
        users.add(user);
        
        try (FileOutputStream fos = new FileOutputStream("utilizador.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(users);
        } catch (IOException e) {
            System.out.println("Erro ao guardar no ficheiro: " + e.getMessage());
        }        
    }
    
    public boolean removeUser(String id){
        ArrayList<Utilizador> users = getAllUsers();
        
        for (int i = 0; i < users.size(); i++) {
            Utilizador aux = users.get(i);
            if (aux.getId().equals(id)) {
                users.remove(aux);
            }
        }
        
        try (FileOutputStream fos = new FileOutputStream("utilizador.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(users);
            return true;
        } catch (IOException e) {
            System.out.println("Erro ao guardar no ficheiro: " + e.getMessage());
            return false;
        }       
    }
    
    public ArrayList<Carro> getAllCarros(){
        
        ArrayList<Carro> carros = new ArrayList<>();        
        
        try (FileInputStream fis = new FileInputStream("carros.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            carros = (ArrayList<Carro>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
                
        return carros;
    }
    
    
    public void addCarro(Carro carro){
        
        ArrayList<Carro> carros = getAllCarros();
        
        carros.add(carro);
        
        try (FileOutputStream fos = new FileOutputStream("carros.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(carros);
        } catch (IOException e) {
            System.out.println("Erro ao guardar no ficheiro: " + e.getMessage());
        }        
    }
    
    public boolean removeCarro(String id){
        ArrayList<Carro> carros = getAllCarros();
        
        for (int i = 0; i < carros.size(); i++) {
            Carro aux = carros.get(i);
            if (aux.getId().equals(id)) {
                carros.remove(aux);
            }
        }
        
        try (FileOutputStream fos = new FileOutputStream("carros.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(carros);
            return true;
        } catch (IOException e) {
            System.out.println("Erro ao guardar no ficheiro: " + e.getMessage());
            return false;
        }       
    }
    
    public ArrayList<Reserva> getAllReservas(){
        
        ArrayList<Reserva> reservas = new ArrayList<>();        
        
        try (FileInputStream fis = new FileInputStream("reservas.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            reservas = (ArrayList<Reserva>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
                
        return reservas;
    }
    
    public void addReserva(Reserva reserva){
        
        ArrayList<Reserva> reservas = getAllReservas();
        
        reservas.add(reserva);
        
        try (FileOutputStream fos = new FileOutputStream("reservas.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(reservas);
        } catch (IOException e) {
            System.out.println("Erro ao guardar no ficheiro: " + e.getMessage());
        }        
    }
    
    
    public ArrayList<Venda> getAllVendas(){
        
        ArrayList<Venda> vendas = new ArrayList<>();        
        
        try (FileInputStream fis = new FileInputStream("vendas.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            vendas = (ArrayList<Venda>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
                
        return vendas;
    }
}
