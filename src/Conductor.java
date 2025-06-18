import com.objetos.Coche;
import com.objetos.Deportivo;

public class Conductor {

    public static void main(String[] args){
        
        // miramos el coche ----------------
        Coche car = new Coche();
        car.setMarca("Seat");
        car.setModelo("Panda");
        System.out.println(car);

        // arrancamos
        car.arrancar();

        // aceleramos
        car.acelerar();
        car.acelerar();
        car.acelerar();
        System.out.println(car);  
        
        // frenar
        car.frenar();
        System.out.println(car);  

        // frenar otra vez
        car.frenar();
        System.out.println(car);  

        // frenar del todo
        car.frenar(true);
        System.out.println(car);

        // miramos el deportivo ------------------
        Deportivo dep = new Deportivo();

        dep.setMarca("Rayo");
        dep.setModelo("Veloz");
        System.out.println(dep);

        // arrancamos
        dep.arrancar();

        // aceleramos
        dep.acelerar();
        dep.acelerar();
        dep.acelerar();
        System.out.println(dep);  
        
        // frenar
        dep.frenar();
        System.out.println(dep);  

        // frenar otra vez
        dep.frenar();
        System.out.println(dep);  

        // frenar del todo
        dep.frenar(true);
        System.out.println(dep);

        // probamos si una vez parado, si aceleramos nos dice que debemos arrancar el coche
        dep.acelerar();
        System.out.println(dep);  

        // el turbo
        dep.turbo();
        System.out.println(dep);
           
    }
}
