import com.objetos.Coche;

public class Conductor {

    public static void main(String[] args){
        
        try{
        
            // llamamos a la clase Coche y le ponemos unos valores;
            Coche coche new Coche();

            coche.setMarca("Citroen");
            coche.setModelo("El primero");
            coche.setVelocidad(120); 
            coche.setvelocidadMaxima(280);

            // visualizamos por pantalla estos datos
            System.out.println("Coche: " + coche.getMarca() + coche.getModelo() + coche.getVelocidad() + coche.getvelocidadMaxima());

        }catch (Exception e){

            System.out.println("Error: " + e.getMessage());
        }
           
    }
}
