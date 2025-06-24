import com.objetos.Director;
import com.objetos.Persona;
import com.objetos.Empleado;


public class App {
    public static void main(String[] args){
        
        System.out.println("Probando la clase Persona");

        try{
            //
        // creamos una arraylist
        ArrayList<Persona> empleados = new ArrayList<Persona>();

        // agregamos empleados
        Empleado emp1 new Empleado();
        emp1.setNombre("Empleado 1");
        emp1.setApellidos("Empleado 1");
        empleados.add(emp1);
        System.out.println("Emp1: " + emp1.getClass());
        System.out.println("Coleccion 0: " + empleados.get(0).getClass);

        Empleado emp2 new Empleado();
        emp2.setNombre("Empleado 2");
        emp2.setApellidos("Empleado 2");
        empleados.add(emp2);

        // agregamos un director
        Director dire = new Director();
        dire.setNombre("Director 1");
        dire.setApellidos("Director 1");
        empleados.add(dire);

        // podemos recorrer todos los empleados
        for(Persona emp:empleados){
            if (emp instanceof Director) {
                ((Director)emp).mandar();
                
            }
            System.out.println(emp.getNombreCompleto());
        }

        Empleado emp = new Empleado(); //añadimos la clase Empleados
        Director dire = new Director();
        System.out.println(emp.toString()); // esto es un objeto que me permite dibujar informacion como yo la quiero

        System.out.println("Vacaciones empleado: " + emp.getDiasVacaciones());
        System.out.println("Vacaciones director: " + dire.getDiasVacaciones());

        Director direc = new Director(); // añadimos la clase director
        System.out.println("Director" + direc.getSalarioMinimo());

        

        emp.setNombre("Nombre Empleado"); 
        emp.setApellidos("Apellidos Empleados");
        System.out.println(emp.getNombreCompleto() + " " + emp.getSalarioMinimo());

        // instanciamos el objeto Persona
        Persona person = new Persona(); // llamamos a la clase Persona.java
        Persona tyrion = new Persona("Tyrion", "Lannister");
        
        // ya podemos utilizar a Persona.java
        person.setNombre("Lucas");
        person.setApellidos("Lopez");
        person.setEdad(45);
        //person.setGenero(Persona.tipoGenero.MASCULINO);
        person.setDni(2211537);
    

        System.out.println(person.getNombre() + " " + person.getApellidos() + " " + " Edad: " + person.getEdad() + " sexo: "+ person.getGenero());
        System.out.println("Nombre completo: " + person.getNombreCompleto());
        System.out.println("Nombre completo: " + person.getNombreCompletoMayusculas());
        System.out.println("Nombre completo: " + person.getNombreCompletoAlreves());
        System.out.println("La letra de el DNI:  " + person.getDni() +" es: " + person.getLetraDni());    


        }catch (Exception e){

            //nunca dejaremos un catch negativo
            System.out.println("Error: " + e.getMessage());
        }
           
    }

} 

// pasos a ejecutar con una base de datos
// try{
//  1- nos conectamos a la bbdd
//  2- leemos registros
//  3- cerramos la conexion
//}catch (Exception e){
//
//}finally{
//  3-cerramos la conexion
//}
