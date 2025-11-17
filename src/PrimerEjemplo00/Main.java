package PrimerEjemplo00;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MiHilo hilo = new MiHilo("hilo h2");

        hilo.start();

        MiHiloRunnable hiloR = new MiHiloRunnable( "Holita desde Hilo R Implemento runable porque solo puedo extender una clase");

        hiloR.run();
    }
}