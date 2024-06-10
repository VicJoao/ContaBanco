// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// the
import Conta.Conta;
public class ContaTerminal {
    public static void main(String[] args) {
       Conta contaAtual = new Conta();
       String response = contaAtual.setupForm();
       System.out.println(response);
    }
}