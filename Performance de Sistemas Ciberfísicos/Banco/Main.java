import java.util.Random; // Importa a classe Random para gerar números aleatórios

// Classe que representa o banco
class Banco{
    private double saldo; // Variável privada para armazenar o saldo

    public Banco(){
        this.saldo = 0.0; // Inicializa o saldo em 0.0
    }

    // Método sincronizado para depósito
    public synchronized void deposito(double valor){
        this.saldo += valor; // Adiciona o valor ao saldo
    }

    // Método sincronizado para saque
    public synchronized void saque(double valor){
        if(valor <= this.saldo){ // Verifica se há saldo suficiente
            this.saldo -= valor; // Realiza o saque
        } else {
            System.out.println("Saldo insuficiente para saque de: " + valor); // Mensagem de erro
        }
    }

    // Método para imprimir o saldo atual
    public void imprimeSaldo(){
        System.out.println("Saldo atual: " + this.saldo);
    }
}

// Thread para realizar depósitos
class DepositaThread extends Thread{
    private Banco banco; // Referência ao banco
    private double valor; // Valor a ser depositado
    
    public DepositaThread(Banco banco, double valor){
        this.banco = banco; // Inicializa o banco
        this.valor = valor; // Inicializa o valor
    }

    @Override
    public void run(){
        this.banco.deposito(valor); // Realiza o depósito
        try {
            Thread.sleep(100); // Espera 100ms para simular tempo de processamento
        } catch (InterruptedException e) {
            System.out.println("Thread interrompida: " + e.getMessage()); // Trata interrupção
        }
        System.out.println("Depósito de " + valor + " realizado."); // Mensagem de confirmação
    }
}

// Thread para realizar saques
class SaqueThread extends Thread{
    private Banco banco; // Referência ao banco
    private double valor; // Valor a ser sacado
    
    public SaqueThread(Banco banco, double valor){
        this.banco = banco; // Inicializa o banco
        this.valor = valor; // Inicializa o valor
    }

    @Override
    public void run(){
        this.banco.saque(valor); // Realiza o saque
        try {
            Thread.sleep(100); // Espera 100ms para simular tempo de processamento
        } catch (InterruptedException e) {
            System.out.println("Thread interrompida: " + e.getMessage()); // Trata interrupção
        }
        System.out.println("Saque de " + valor + " realizado."); // Mensagem de confirmação
    }
}

// Classe principal do programa
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random(); // Cria um gerador de números aleatórios
        
        double valorDeposito = random.nextDouble() * 1000; // Gera valor aleatório para depósito
        double valorSaque = random.nextDouble() * 1000;    // Gera valor aleatório para saque

        Banco banco = new Banco(); // Cria uma instância do banco

        // Cria threads para depósito e saque
        DepositaThread dthread1 = new DepositaThread(banco, valorDeposito);
        SaqueThread sthread1 = new SaqueThread(banco, valorSaque);
        DepositaThread dthread2 = new DepositaThread(banco, valorDeposito);
        SaqueThread sthread2 = new SaqueThread(banco, valorSaque);
        SaqueThread sthread3 = new SaqueThread(banco, valorSaque);
    
        // Inicia as threads
        dthread1.start();
        dthread2.start();
        sthread1.start();
        sthread2.start();
        sthread3.start();

        // Aguarda todas as threads terminarem
        dthread1.join();
        sthread1.join();
        dthread2.join();
        sthread2.join();
        sthread3.join();
        
        banco.imprimeSaldo(); // Imprime o saldo final do banco
    }
}