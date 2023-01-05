/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stand;

import java.util.*;

/**
 *
 * @author 35191
 */
public class Reserva {
    
   private Date dataReserva;
   
   private boolean reservado=false;

   
    public Reserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }
  
    
  
   
   
   
   
    
}
