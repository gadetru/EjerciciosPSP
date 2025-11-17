package PrimerEjemplo00;

public class MiHiloRunnable implements Runnable{
    private String name;

    public MiHiloRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run(){
        System.out.println("Hola desde el hilo runnable " + name );
    }
}
