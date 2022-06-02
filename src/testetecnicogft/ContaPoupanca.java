
package testetecnicogft;

public class ContaPoupanca extends Conta{
    @Override
    public Double rendimento() {
        return 0.05 * getSaldo();
    }
    
    @Override
    public String toString() {
        return "Conta{" + "titular=" + titular + ", saldo=" + saldo + ", numero=" + numero + ", rendimento=" + rendimento() + '}';
    }
}
