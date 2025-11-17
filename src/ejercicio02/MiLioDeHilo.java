package ejercicio02;

public class MiLioDeHilo implements Runnable{
    private int numHilo;


    public MiLioDeHilo(int numHilo){
        this.numHilo = numHilo;
    }

    @Override
    public void run() {
        System.out.println("Hola, estás dentro del hilo " + numHilo + " mi Id es: " );
    }
}
