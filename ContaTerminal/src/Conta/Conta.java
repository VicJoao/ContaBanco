package Conta;
import java.util.Scanner;

public class Conta {
    int numero;
    String agencia;
    String nomeCliente;
    float saldo;
    public Conta(){
        numero = 0;
        agencia = "0001";
        nomeCliente = "user";
        saldo = 0;
    }
    public String setupForm() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência.");
        this.agencia = scanner.next();
        System.out.println("Por favor, digite o número da Conta.");
        this.numero = scanner.nextInt();
        System.out.println("Por favor, digite o Nome do cliente.");
        this.nomeCliente =  scanner.next();
        System.out.println("Por favor, digite o Saldo da conta.");
        this.saldo = scanner.nextFloat();
        return String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", this.nomeCliente,this.agencia,this.numero,this.saldo);
    }


    //GETTERS

    public float getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    //SETTERS
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
