import com.dio.conta_banco.modelos.Conta;

public class ContaTerminal {
    public static void main(String[] args) {

        System.out.println("Olá! Seja bem-vindo.");
        System.out.println("Por favor, efetue seu cadastro para continuar:");

        Conta contaUsuario = new Conta();

        System.out.println("Olá " + contaUsuario.getNomeCliente() + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + contaUsuario.getAgencia() + ", conta " + contaUsuario.getNumeroConta()+ ".");
        System.out.println("E seu saldo de " + contaUsuario.getSaldo() + " já está disponível para saque.");

    }
}
