/**
 * Representa uma conta bancária.
 *
 * Esta classe fornece métodos para realizar operações como saque e depósito,
 * bem como acessar e modificar informações sobre a conta, como dono, número,
 * saldo e limite.
 */
public class Conta {

    /** Nome do dono da conta. */
    private String dono;

    /** Número da conta. */
    private Integer numero;

    /** Saldo atual da conta. */
    private Double saldo;

    /** Limite de crédito da conta. */
    private Double limite;

    /**
     * Construtor para criar uma instância da classe Conta.
     *
     * @param dono    O nome do dono da conta.
     * @param numero  O número da conta.
     * @param limite  O limite de crédito da conta.
     * @param saldo   O saldo inicial da conta.
     */
    public Conta(String dono, int numero, Double limite, Double saldo) {
        this.dono = dono;
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }

    /**
     * Tenta realizar um saque na conta.
     *
     * @param valor O valor a ser sacado.
     * @return true se o saque for bem-sucedido, false caso contrário.
     */
    public boolean sacar(Double valor) {
        if (saldo <= valor) {
            /**
             *  Não pode sacar
             */
            return false;
        } else {
            /**
             *  Pode sacar
             */
            saldo = saldo - valor;
            return true;
        }
    }

    /**
     * Tenta realizar um depósito na conta.
     *
     * @param quantidade A quantidade a ser depositada.
     * @return true se o depósito for bem-sucedido, false caso contrário.
     */
    public boolean depositar(Double quantidade) {
        if (limite <= quantidade + saldo) {
            /**
             *  Não pode depositar
             */
            return false;
        } else {
            /**
             *  Pode depositar
             */
            saldo += quantidade;
            return true;
        }
    }

    /**
     *  Métodos getters e setters
     */

    /**
     * Obtém o nome do dono da conta.
     *
     * @return O nome do dono da conta.
     */
    public String getDono() {
        return dono;
    }

    /**
     * Define o nome do dono da conta.
     *
     * @param dono O novo nome do dono da conta.
     */
    public void setDono(String dono) {
        this.dono = dono;
    }

    /**
     * Obtém o número da conta.
     *
     * @return O número da conta.
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * Define o número da conta.
     *
     * @param numero O novo número da conta.
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    /**
     * Obtém o saldo atual da conta.
     *
     * @return O saldo atual da conta.
     */
    public Double getSaldo() {
        return saldo;
    }

    /**
     * Define o saldo da conta.
     *
     * @param saldo O novo saldo da conta.
     */
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtém o limite de crédito da conta.
     *
     * @return O limite de crédito da conta.
     */
    public Double getLimite() {
        return limite;
    }

    /**
     * Define o limite de crédito da conta.
     *
     * @param limite O novo limite de crédito da conta.
     */
    public void setLimite(Double limite) {
        this.limite = limite;
    }
}
