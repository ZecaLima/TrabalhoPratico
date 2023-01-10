package Stand;

import java.io.Serializable;
import java.util.*;

public class Veiculo implements Serializable {
    
    private static int numVeiculo=0;
    
    private int id=0;
    private String marca;
    private String modelo;
    private boolean isActive=true;
    private boolean Reservado=false;
    private Date dataVenda=null;
    
    
    public Veiculo(int id, String marca, String modelo, Date dataVenda) {
       this.id=Veiculo.numVeiculo +1;
       this.marca = marca;
       this.modelo = modelo;
       this.dataVenda = dataVenda;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    

    public static int getNumVeiculo() {
        return numVeiculo;
    }

    public static void setNumVeiculo(int numVeiculo) {
        Veiculo.numVeiculo = numVeiculo;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isReservado() {
        return Reservado;
    }

    public void setReservado(boolean reservado) {
        Reservado = reservado;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    } 
    
}
