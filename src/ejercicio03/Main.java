package ejercicio03;

// Crea un programa en java que simule una carrera de 10 atletas.
// Cada uno debera correr 100 metros de forma que cada vez que se ejecuten se generará un numero aleatorio de metros recorridos.
// En cada iteracion, cada atleta se identificará y dira cuantso metros ha recorrido.
// Una vez el atleta llegue a la linea de meta, avisará por consola y finalizará su ejecucion.
// El programa principal avisará cuando la carrera haya finalizado.

public class Main {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            Atleta atleta = new Atleta(i + 1 );
            Thread thread = new Thread(atleta);
            thread.run();
        }

        System.out.println("Fin de la carrera");


    }
}
