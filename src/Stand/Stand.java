package Stand;

import java.util.ArrayList;
import java.util.List;

public class Stand {

    private List<Veiculo> veiculos;
    
    private List<Reserva> reservas;

    public Stand(){
        
    List<Veiculo> veiculos = new ArrayList<>();
        
        //listar veiculos para cliente
         public List<Veiculo> listarVeiculos(){
            List<Veiculo> veiculos = new ArrayList<>();
            for(Veiculo v1: this.veiculos){
                if(v1.isActive() == true && v1.isReservado() == false){
                    System.out.println("ID do veiculo: "+v1.getId()+"; Marca: "+v1.getMarca()
                    +"Modelo"+v1.getModelo());
                }
            }
        }

        //listar veiculos do dono
        public List<Veiculo> listarTodosVeiculos(){
            for(Veiculo v1: this.veiculos){
                if(v1.getId().isEmpty() == false){
                    System.out.println("ID do veiculo: "+v1.getId()+"; Marca: "+v1.getMarca()
                            +"Modelo"+v1.getModelo()+"Reservado: "+v1.isReservado());
                }
            }
        }




    }

}

