package ejercicio04;
//Crea dos hilos en java que extiendan de la clase thread. Uno debe mostrar en la pantalla un uncle infinito la palabra TIC
// y el otro la palabra TAC.
//Dentro del bucle usa el metoodo sleep() para que dé tiempo a visualizar las palabras que se muestran al ejecutarlos.

public class Main {
    public static void main(String[] args) {
        TicTacMonitor monitor = new TicTacMonitor();
        TicMonitor tic = new TicMonitor(1,monitor);
        TacMonitor tac = new TacMonitor(2,monitor);

        tic.start();
        tac.start();
    }
}
