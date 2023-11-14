import java.util.ArrayList;

class CadastroDeContas {
    private final ArrayList<Conta> contas = new ArrayList<>();

    public boolean cadastrarConta(int numero, double saldo, String titular) {
        Conta novaConta = new Conta();
        novaConta.numero = numero;
        novaConta.saldo = saldo;
        novaConta.titular = titular;
        return contas.add(novaConta);
    }

    public Conta procurarConta(int numeroConta) {
        for (Conta conta : contas) {
            if (conta.numero == numeroConta) {
                return conta;
            }
        }
        return null;
    }
    
    public boolean excluirConta(int numeroConta) {
        for (int i = 0; i < contas.size(); i++) {
            Conta conta = contas.get(i);
            if (conta.numero == numeroConta) {
                contas.remove(i);
                return true;
            }
        }
        return false;
    }

    public int qtdCadastradas() {
        return contas.size();
    }
}