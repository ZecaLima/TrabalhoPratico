/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;


import DAL.Admin;
import DAL.DonoStand;
import DAL.Utilizador;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author jcarl
 */
public class BLLMenuAdmin {
    dados dados = new dados();
    
    public int addDono(String email, String password, String nome, String telemovel){
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
                        DonoStand dono = new DonoStand(email, password, nome, telemovelint);
                        dados.addUser(dono);
                        JOptionPane.showMessageDialog(null, "Dono do Stand adicionado com sucesso!");
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
    
    public int addAdmin(String email, String password){
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
                        Admin admin = new Admin(email, password);
                        dados.addUser(admin);
                        JOptionPane.showMessageDialog(null, "Admin adicionado com sucesso!");
                        return 0;                     
                    }else{
                        return 1;
                    }
                   
                }else{
                   return 2;
                }
    }
}
