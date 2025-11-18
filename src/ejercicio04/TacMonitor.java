package ejercicio04;

public class TacMonitor extends Thread{
    private int hilo;
    private TicTacMonitor monitor;

    public TacMonitor(int hilo, TicTacMonitor monitor){
        this.hilo = hilo;
        this.monitor = monitor;
    }

    public void run(){
        while (true){
            try {
                monitor.esperaTacTurno();
                System.out.println("hilo " + hilo + " dice TAC.");
                sleep(1000);
                monitor.cambioTurno();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
