package ejercicio01;

//vamos a crear un programa que lance 5 hilos y por cada hilo, lance 10 saludos.

// en la clase saludo, tenemos implementado los 10 saludos en un bucle
// dentro del main, hemos creado un bucle para generar 5 veces la llamada al hilo


public class Main {
    public static void main(String[] args) throws InterruptedException {

        for (int i =0; i<5;i++){
            SaludoRunnable saludoRunnable= new SaludoRunnable(i+1);
            // con la clase Thread, generamos los hilos.
            Thread thread = new Thread(saludoRunnable);
            thread.start();
            // con el metodo join(), vamos a sincronizar los procesos
            thread.join();
        }
        System.out.println("Fin del programa");
    }

    // metodos que debemos conocer:
    // join(); espera que finalice el hilo para iniciar el siguiente
    //wait(); pausa el hilo
    // notify(); despierta el hilo, lo libera del wait
    // notifyAll() despierta todos los hilos pausados
    // syncroniced() evita que pueda ejecutarse concurrentemente una porcion de codigo
}
