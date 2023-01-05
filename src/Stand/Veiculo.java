package Stand;

import java.io.Serializable;
import java.util.*;

public class Veiculo implements Serializable {
    private String id;
    private String marca;
    private String modelo;
    private boolean isActive=true;
    private boolean Reservado=false;
    private Date dataVenda=null;


    public Veiculo(String id, String marca, String modelo, Date dataVenda) {
        this.id=id;
        this.marca = marca;
        this.modelo = modelo;
        this.dataVenda = dataVenda;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
