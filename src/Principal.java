import javax.swing.JOptionPane;

public class Principal {
    public static void main (String[]args){
        int numero;
        double saldo,limite,rendimento;
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Banco:\n<1>Conta Corrente\n<2>Conta Poupança\n<3>Sair"));
        switch (opcao){
            case 1:
                numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta:"));
                saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo:"));
                limite = Double.parseDouble(JOptionPane.showInputDialog("limite: "));
                ContaCorrente contaCorrente = new ContaCorrente(numero,saldo,limite);
                JOptionPane.showMessageDialog(null, "Saldo:"+ contaCorrente.getSaldo()+"\nSaldo com o limite: "+contaCorrente.consultaSaldoTotal(), "Conta Corrente", JOptionPane.INFORMATION_MESSAGE);
              break;

            case 2:
                numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta:"));
                saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo:"));
                rendimento = Double.parseDouble(JOptionPane.showInputDialog("Rendimento: "));
                ContaPoupanca contaPoupanca = new ContaPoupanca(numero,saldo,rendimento);
                contaPoupanca.atualizaRendimento();
                JOptionPane.showMessageDialog(null, "Saldo:"+ contaPoupanca.getSaldo(),"\nConta Poupança: ", JOptionPane.INFORMATION_MESSAGE);
                break;

            default:
                JOptionPane.showMessageDialog(null,"Escolha inválida","Saindo...",JOptionPane.ERROR_MESSAGE);
    }
}
