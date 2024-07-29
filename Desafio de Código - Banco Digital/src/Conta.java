public abstract class Conta implements Iconta{

    protected static int AGENCIA_PADRAO = 1;
    public static int SEQUENCIAL = 1;

    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    
    protected int agencia;
    protected int numero;
    protected double saldo;

    public void sacar(double valor){
        saldo -= valor;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void exibirInfosComuns(){
        System.out.println(String.format ("Agencia: %d " , this.agencia));
        System.out.println(String.format ("Número da conta: %d " , this.numero));
        System.out.println(String.format ("Saldo: %.2f" , this.saldo));
    }
    public abstract void imprimirExtrato();
    
}
