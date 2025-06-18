import java.util.ArrayList;
import com.objetos.Mes;
import java.util.Random;

public class Clima01 {

    public static void main(String[] args) {
        
        Random rand = new Random();
        ArrayList<Mes> coleccion = new ArrayList<Mes>(); // una coleccion con un objeto (Mes) 
        String[] nombresmeses = new String[] {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"}; 

        for(int i = 1; i <= 12; i++){

            Mes mes = new Mes();

            mes.setNombreMes(nombresmeses[i-1]);
            int max = 50;
            int num = rand.nextInt(max) + 1;
            mes.setTempMaxima(num);

            max = 50;
            num = rand.nextInt(max) + 1;
            mes.setTemMinima(num);

            coleccion.add(mes);

        }
        // para ver que se ha grabado
        for(Mes m : coleccion){
            System.out.println(m);
        }

    }
}
