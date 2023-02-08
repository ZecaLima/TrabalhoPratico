/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.Carro;
import DAL.Venda;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author jcarl
 */
public class BLLMenuDono {
    dados dados = new dados();
    
    public int addCarro(String marca, String modelo, String preco){
        //verificar se é um numero telefonico
        int precoint = Integer.parseInt(preco.trim());
        if(precoint>0){                                  
                        Carro car = new Carro(marca, modelo, precoint);
                        dados.addCarro(car);
                        JOptionPane.showMessageDialog(null, "Carro adicionado com sucesso!");
                        return 0;                     
            }else{
                return 1;
            }
    }
    
    public boolean alterarEstado(String id, int estado){
        
        ArrayList<Carro> carros = dados.getAllCarros();
        
        for (int i = 0; i < carros.size(); i++) {
            Carro aux = carros.get(i);
            if (aux.getId().equals(id)) {
                aux.setEstado(estado);
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
    
    public boolean cancelarReserva(String id_reserva, String id_Carro){
        dados.removeReserva(id_reserva);
        alterarEstado(id_Carro, 2);        
        return true;
    }
    
    public boolean concluirVenda(String id_reserva, String id_cliente,String id_Carro){
        dados.removeReserva(id_reserva);
        alterarEstado(id_Carro, 0);
        Venda venda = new Venda(id_Carro, id_cliente);
        dados.addVenda(venda);
        return true;
    }
    
    public boolean concluirVenda(String id_cliente,String id_Carro){
        alterarEstado(id_Carro, 0);
        Venda venda = new Venda(id_Carro, id_cliente);
        dados.addVenda(venda);
        return true;
    }
}
