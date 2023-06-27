public class ContaBancaria {
    private double saldo;
    public ContaBancaria(int numeroConta, Cliente cliente){
        this.saldo = 0.0;
    }
    
    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }


    public void sacar(double valor){
        if (valor > 0){
            if(valor <= saldo){
                saldo -= valor;
                System.out.println("Saque realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }


    public double consultarSaldo(){
        return saldo;
    }

    public int getNumeroConta() {
        return 0;
    }


}
