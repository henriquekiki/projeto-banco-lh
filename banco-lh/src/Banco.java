import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<ContaBancaria> contas;

    // Construtor da classe Banco
    public Banco() {
        contas = new ArrayList<>();
    }

    // Método para abrir uma nova conta no banco
    public void abrirConta(int numeroConta, Cliente cliente) {
        ContaBancaria novaConta = new ContaBancaria(numeroConta, cliente);
        contas.add(novaConta);
        System.out.println("Nova conta aberta com sucesso.");
    }

    // Método para buscar uma conta pelo número
    public ContaBancaria buscarConta(int numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null; // Retorna null se a conta não for encontrada
    }

    // Método para listar todas as contas do banco
    public void listarContas() {
        System.out.println("Lista de contas do banco:");
        for (ContaBancaria conta : contas) {
            System.out.println("Número da conta: " + conta.getNumeroConta());
            System.out.println("Saldo: " + conta.consultarSaldo());
            System.out.println("---------------------------");
        }
    }
}
