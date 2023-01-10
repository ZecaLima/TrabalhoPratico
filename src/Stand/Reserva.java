/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stand;

import Utilizadores.*;
import java.util.*;

/**
 *
 * @author 35191
 */
public class Reserva {
    
   private static int numReserva=0;
   
   private int id=0;
    
   private Date dataReserva;
   
    private List<Veiculo> veiculos;
   
   
    public Reserva(int id, Date dataReserva, Cliente cliente) {
        this.id=id + Reserva.numReserva +1;
        this.dataReserva = dataReserva;
        Reserva.numReserva ++;
    }
   
            

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }
  
    
     //listar veiculos para cliente
    public List<Veiculo> listarVeiculos(){
            List<Veiculo> veiculos = new ArrayList<>();
            for(Veiculo v1: this.veiculos){
                if(v1.isActive() == true && v1.isReservado() == false){
                    System.out.println("ID do veiculo: "+v1.getId()+"; Marca: "+v1.getMarca()
                    +"Modelo"+v1.getModelo());
                }
            }
            return veiculos;
    }
    
    //listar veiculos do dono
        public List<Veiculo> listarTodosVeiculos(){
            for(Veiculo v1: this.veiculos){
                if(v1.getId() >= 0){
                    System.out.println("ID do veiculo: "+v1.getId()+"; Marca: "+v1.getMarca()
                            +"Modelo"+v1.getModelo()+"Reservado: "+v1.isReservado());
                }
            }
            return veiculos;
        }
   
}
