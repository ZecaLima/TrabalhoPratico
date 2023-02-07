/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author jcarl
 */
public class Venda implements Serializable{
    private String id;
    private String idCarro;
    private String idCliente;
    
    public Venda(String idCarro, String idCliente){
        this.id = UUID.randomUUID().toString();
        this.idCarro = idCarro;
        this.idCliente = idCliente;
    }

    public String getId() {
        return id;
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
}
