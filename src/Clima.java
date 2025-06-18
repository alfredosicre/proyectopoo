import java.util.ArrayList;
import java.util.Scanner;
import com.objetos.Mes;

public class Clima {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        ArrayList<Mes> coleccion = new ArrayList<Mes>(); // una coleccion con un objeto (Mes)

        for(int i = 1; i <= 12; i++){

            Mes mes = new Mes();

            System.out.println("introduzca el MES: " + i + " ");
            String nombre = teclado.nextLine();

            System.out.println("introduzca la temperatura MAXIMA: ");
            int temMaxima = Integer.parseInt(teclado.nextLine());

            System.out.println("introduzca la temperatura MINIMA: ");
            int temMinima = Integer.parseInt(teclado.nextLine());

            mes.setNombreMes(nombre);
            mes.setTempMaxima(temMaxima);
            mes.setTemMinima(temMinima);

            coleccion.add(mes);

        }
        // para ver que se ha grabado
        for(Mes m : coleccion){
            System.out.println("Nombre: " + m);
        }


    }
    
}
