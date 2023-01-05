package trabPrat;
import Execoes.*;
import Utilizadores.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class criarUsers implements Serializable {

    private Map<String, Utilizador> utilizadores;

    public criarUsers(){

         utilizadores = new HashMap<>();

         //criar admin
         Admin admin = new Admin("admin","Administrador", "1234");
         utilizadores.put(admin.getUsername(), admin);
    }


    public List<Utilizador>listarUtilizadores(){
        List<Utilizador> utilizadores = new ArrayList<>();
        for(Utilizador util: this.utilizadores.values()) {
            utilizadores.add(util);
        }
        return utilizadores;
    }



    // registar Utilizador
    public void registarUtilizador(Utilizador user) throws UsernameRepetidoException{
        boolean existe = false;
        Utilizador utilizador = null;
        for(Utilizador util: this.listarUtilizadores()){
            if(util.getUsername().equals(user.getUsername())){
                existe = true;
                utilizador = (Utilizador) util;
                break;
            }
        }
        if(existe){
            if(utilizador.getUsername().equals(user.getUsername())){
               throw new UsernameRepetidoException("Nome:" + user.getUsername() + "ja existe");
            }
        } else {
            this.utilizadores.put(user.getUsername(), user);
        }
    }


    //login no sistema
    public Utilizador loginSistema(String username, String password) throws ContaNaoReconhecida {
        Utilizador utilizador = null;
        for (Utilizador util : this.listarUtilizadores()) {
            if (util.getUsername().equals(username) && (util.getPassword().equals(password))) {
                utilizador = util;
                return utilizador;
            }
        }
        throw new ContaNaoReconhecida("Conta não reconhecida. Confirme se os seus dados estao corretos");
    }



    //logout no sistema





    //alterar os dados do cliente
    public void alterarDadosCliente(Cliente novo){
        Cliente c1=null;
        for(Utilizador util:this.listarUtilizadores()){
            if(util instanceof Cliente){
                if(util.getId() == novo.getId()){
                    util.setUsername(novo.getUsername());
                    util.setNome(novo.getNome());
                }
            }
        }
    }


    //alterar dados do
    public void alterarDadosDono( novo){
        Cliente c1=null;
        for(Utilizador util:this.listarUtilizadores()){
            if(util instanceof Cliente){
                if(util.getId() == novo.getId()){
                    util.setUsername(novo.getUsername());
                    util.setNome(novo.getNome());
                }
            }
        }
    }













    public Map<String, Utilizador> getUtilizadores() {
        return utilizadores;
    }

    public void setUtilizadores(Map<String, Utilizador> utilizadores) {
        this.utilizadores = utilizadores;
    }











}
