/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author jcarl
 */
public class Reserva implements Serializable{
    String idReserva;
    String idCarro;
    String idCliente;
    Date data;

    
    public Reserva(String idCarro, String idCliente, Date data){
        this.idReserva = UUID.randomUUID().toString();
        this.idCarro = idCarro;
        this.idCliente = idCliente;
        this.data = data;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public String getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(String idCarro) {
        this.idCarro = idCarro;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
    
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
