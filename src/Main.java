public class Main {

    public static void main(String[] args) {
        Cliente Jackson = new Cliente();
        Jackson.setNome("Jackson");

        Conta cc = new ContaCorrente(Jackson);
        Conta poupança = new ContaPoupanca(Jackson);

        cc.depositar(100);
        cc.transferir(100, poupança);

        cc.imprimirExtrato();
        poupança.imprimirExtrato();
    }
}
