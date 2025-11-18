package ejercicio04;

public class TicMonitor extends Thread{
    private int hilo;
    private TicTacMonitor monitor;

    public TicMonitor(int hilo, TicTacMonitor monitor){
        this.hilo = hilo;
        this.monitor = monitor;
    }

    public void run(){
        while (true){
            try {
                monitor.esperaTicTurno();
                System.out.println("hilo " + hilo + " dice TIC.");
                sleep(1000);
                monitor.cambioTurno();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
