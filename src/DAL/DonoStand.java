/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.util.UUID;

/**
 *
 * @author 35191
 */
public class DonoStand extends Utilizador{
    private String nome;
    private int nTelemovel;

    public DonoStand(String email, String password, String nome, int nTelemovel) {
        super(email, password);
        this.nome = nome;
        this.nTelemovel= nTelemovel;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnTelemovel() {
        return nTelemovel;
    }

    public void setnTelemovel(int nTelemovel) {
        this.nTelemovel = nTelemovel;
    }    
}
