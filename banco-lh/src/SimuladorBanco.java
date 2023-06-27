public class SimuladorBanco {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Luiz Lopes", "Rua aires da cunha", "(11) 96913-0686");

        
        Banco banco = new Banco();

        
        banco.abrirConta(1, cliente);

        
        int numeroConta = 1;
        double valorDeposito = 100.0;

        ContaBancaria conta = banco.buscarConta(numeroConta);
        if (conta != null) {
            conta.depositar(valorDeposito);
            System.out.println("Depósito realizado com sucesso na conta " + numeroConta);
            System.out.println("Saldo atual: " + conta.consultarSaldo());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }
}
