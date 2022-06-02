
package testetecnicogft;

public class ContaCorrente extends Conta {
    @Override
    public Double rendimento() {
        return 0.03 * getSaldo();
    }
    
       @Override
    public String toString() {
        return "Conta{" + "titular=" + titular + ", saldo=" + saldo + ", numero=" + numero + ", rendimento=" + rendimento() + '}';
    }
    
   
}
