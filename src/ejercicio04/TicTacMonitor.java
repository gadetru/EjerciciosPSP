package ejercicio04;

public class TicTacMonitor {

    private boolean ticTurno = true;

    public synchronized void esperaTicTurno() throws InterruptedException {
        while (!ticTurno){
            wait();
        }
    }
    public synchronized void esperaTacTurno() throws InterruptedException {
        while (ticTurno){
            wait();
        }
    }

    public synchronized void cambioTurno(){
        ticTurno = !ticTurno;
        notifyAll();
    }
}
