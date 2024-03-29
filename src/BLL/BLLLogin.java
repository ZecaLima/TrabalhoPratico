/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.*;
import UI.*;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author jcarl
 */
public class BLLLogin {
    dados dados = new dados();
    
    
    public boolean Login(String email, String password){    
        
        ArrayList<Utilizador> users = dados.getAllUsers();
        for(Utilizador aux : users){
            if(aux.getEmail().equals(email)){
                if(aux.getPassword().equals(password)){
                    if(aux instanceof Cliente){
                        new MenuCliente(aux).setVisible(true);
                        return true;
                    }else if(aux instanceof DonoStand){
                        new MenuDono(aux).setVisible(true);
                        return true;
                    }else if(aux instanceof Admin){
                        new MenuAdmin(aux).setVisible(true);
                        return true;
                    }                   
                    return false;
                }
            }
        }       
        return false;
    }
    
    public int Registo(String email, String password, String nome, String telemovel){
        //verificar se é um numero telefonico
        int telemovelint = Integer.parseInt(telemovel.trim());
        if(telemovel.length()==9){
                //verificar se é email
                final Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
                
                if(EMAIL_REGEX.matcher(email).matches()){
                    //verificar se email ja existe
                    boolean existe = false;                    
                    ArrayList<Utilizador> users = dados.getAllUsers();
                    for(Utilizador aux : users){
                        if(aux.getEmail().equals(email)){
                                existe=true;
                        }
                    }    
                    
                    if(existe==false){
                        Cliente registo = new Cliente(email, password, nome, telemovelint);
                        dados.addUser(registo);
                        JOptionPane.showMessageDialog(null, "Registo Efetuado com sucesso!");
                        return 0;                     
                    }else{
                        return 1;
                    }
                   
                }else{
                   return 2;
                }
            }else{
                return 3;
            }
    }
}

