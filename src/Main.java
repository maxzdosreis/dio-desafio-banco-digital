public class Main {
    public static void main(String[] args) {
        Cliente max = new Cliente();
        max.setNome("Max Reis");

        Conta cc = new ContaCorrente(max);
		Conta poupanca = new ContaPoupanca(max);

        cc.depositar(200);
		cc.transferir(150, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
    }
}
