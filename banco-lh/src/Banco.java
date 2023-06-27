import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<ContaBancaria> contas;

    
    public Banco() {
        contas = new ArrayList<>();
    }

    
    public void abrirConta(int numeroConta, Cliente cliente) {
        ContaBancaria novaConta = new ContaBancaria(numeroConta, cliente);
        contas.add(novaConta);
        System.out.println("Nova conta aberta com sucesso.");
    }

    
    public ContaBancaria buscarConta(int numeroConta) {
        for (ContaBancaria conta : contas) {
            if ((conta).getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null; 
    }

    
    public void listarContas() {
        System.out.println("Lista de contas do banco:");
        for (ContaBancaria conta : contas) {
            System.out.println("Número da conta: " + (conta).getNumeroConta());
            System.out.println("Saldo: " + conta.consultarSaldo());
            System.out.println("---------------------------");
        }
    }
    
}
