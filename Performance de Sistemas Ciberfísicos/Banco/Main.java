import java.util.Random;

class Banco{
    private double saldo;
    public Banco(){
        this.saldo = 0.0;
    }
    public synchronized void deposito(double valor){
        this.saldo += valor;
    }
    public synchronized void saque(double valor){

        if(valor <= this.saldo){
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque de: " + valor);
        }
    }

    public void imprimeSaldo(){
        System.out.println("Saldo atual: " + this.saldo);
    }

}

class DepositaThread extends Thread{
    private Banco banco;
    private double valor;
    
    public DepositaThread(Banco banco, double valor){
        this.banco = banco;
        this.valor = valor;
    }
    @Override
    public void run(){
        this.banco.deposito(valor);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Thread interrompida: " + e.getMessage());
        }
        System.out.println("Depósito de " + valor + " realizado.");
    }
}

class SaqueThread extends Thread{
    private Banco banco;
    private double valor;
    
    public SaqueThread(Banco banco, double valor){
        this.banco = banco;
        this.valor = valor;
    }
    @Override
    public void run(){
        this.banco.saque(valor);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Thread interrompida: " + e.getMessage());
        }
        System.out.println("Saque de " + valor + " realizado.");
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        
        double valorDeposito = random.nextDouble() * 1000;
        double valorSaque = random.nextDouble() * 1000;

        Banco banco = new Banco();
        DepositaThread dthread1 = new DepositaThread(banco, valorDeposito);
        SaqueThread sthread1 = new SaqueThread(banco, valorSaque);
        DepositaThread dthread2 = new DepositaThread(banco, valorDeposito);
        SaqueThread sthread2 = new SaqueThread(banco, valorSaque);
        SaqueThread sthread3 = new SaqueThread(banco, valorSaque);
    
        
        dthread1.start();
        dthread2.start();
        sthread1.start();
        sthread2.start();
        sthread3.start();

        dthread1.join();
        sthread1.join();
        dthread2.join();
        sthread2.join();
        sthread3.join();
        
        banco.imprimeSaldo();

    }
}
