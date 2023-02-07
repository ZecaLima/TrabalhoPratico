/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.Reserva;
import javax.swing.JOptionPane;

/**
 *
 * @author jcarl
 */
public class BLLMenuCliente {
    dados d = new dados();
    BLLMenuDono dono = new BLLMenuDono();
    
    public void efetuarReserva(String idCarro, String idCliente, String data){
        Reserva reserva = new Reserva(idCarro, idCliente, data);
        d.addReserva(reserva);
        dono.alterarEstado(idCarro, 1);
        
        JOptionPane.showMessageDialog(null, "Carro reservado com sucesso!");
    }
}
