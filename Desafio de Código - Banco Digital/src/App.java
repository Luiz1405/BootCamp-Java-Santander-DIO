public class App{
public static void main(String[]args) {
    Conta cc = new ContaCorrente();
    Conta poupanca = new ContaPoupanca();

    cc.depositar(500);
    cc.transferir(250, poupanca);

    cc.imprimirExtrato();
    poupanca.imprimirExtrato();
}
}
