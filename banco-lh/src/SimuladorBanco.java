public class SimuladorBanco {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Luiz Lopes", "Rua aires da cunha, 0", "11 96913-0686");
        Cliente cliente1 = new Cliente("Ariani Lopes", "Rua aires da cunha, 0", "11 96913-0686");

        Banco banco = new Banco();

        banco.abrirConta(1, cliente);
        banco.abrirConta(2, cliente1);
        
        banco.listarContas();


    }
}
