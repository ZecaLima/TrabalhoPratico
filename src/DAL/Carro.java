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
public class Carro implements Serializable{
    private String id;
    private String marca;
    private String modelo;
    private int preco;
    private int estado; //0-desativado, 1-reservado, 2-disponivel
    
    public Carro(String marca, String modelo, int preco){
        this.id = UUID.randomUUID().toString();
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.estado=2;
    }

    public String getId() {
        return id;
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

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
