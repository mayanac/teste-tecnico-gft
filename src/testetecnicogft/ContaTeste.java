
package testetecnicogft;


public class ContaTeste {
    
    public static void main(String[] args) {
       ContaCorrente minhaContaCorrente = new ContaCorrente();
       ContaPoupanca minhaContaPoupanca  = new ContaPoupanca();
       
       minhaContaCorrente.setTitular("Mayana Clesia");
       minhaContaCorrente.setSaldo(1000.0);
       minhaContaCorrente.setNumero(1);
       
       minhaContaPoupanca.setTitular("Mayana Clesia");
       minhaContaPoupanca.setSaldo(2000.0);
       minhaContaPoupanca.setNumero(1);
       
        System.out.println("Conta Poupança");
        System.out.println(minhaContaPoupanca);
        
        
        System.out.println("Conta Corrente");
        System.out.println(minhaContaCorrente);
    }
    
}
