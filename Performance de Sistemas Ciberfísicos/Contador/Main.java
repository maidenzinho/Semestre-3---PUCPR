class Contador{
    private int valor;

    public Contador(){
        this.valor = 0;
    }
    public synchronized void incrementa(){
        this.valor++;
    }
    public void imprime(){
        System.out.println(this.valor);
    }
}
class ContaThread extends Thread{
    private Contador contador;
    public ContaThread(Contador contador){
        this.contador = contador;
    }
    public void run(){
        for(int i = 0; i < 10_000; i++){
            this.contador.incrementa();
        }
    }
}
public class Main{
    public static void main(String[] args) throws InterruptedException {
        Contador contador = new Contador();

        ContaThread contaThread1 = new ContaThread(contador);
        ContaThread contaThread2 = new ContaThread(contador);

        contaThread1.start();
        contaThread2.start();

        contaThread1.join();
        contaThread2.join();

        contador.imprime();
    }
}