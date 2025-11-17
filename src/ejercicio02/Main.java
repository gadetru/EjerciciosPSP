package ejercicio02;

// Vamos a crear un programa que lance 3 hilos con un nombre con una prioridad cada uno
// Cada uno mostrará un mensaje que avise que estamos dentro de el, su prioridad, su id y el numero de hilos que en ese momento hay activos.
// Ademas, el programa principal, indicará que ha creado los 3 hilos y cuantos están activos en el momento en que escribe.

public class Main {
     public static void main(String[] args) {

         for (int i = 0; i < 3; i++){
             MiLioDeHilo hilo = new MiLioDeHilo(i +1);

             Thread thread = new Thread(hilo);
             String nombre = thread.getName();
             Long id = thread.getId();
             int prioridad = thread.getPriority();
             int activos = thread.activeCount();

             System.out.println("soy el hilo " + nombre + ", con el id: " + id + ", mi prioridad es: " + prioridad + " Y tenemos activos " + activos + " hilos");

         }
    }
}
