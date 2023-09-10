package Exercicio2;

import javax.swing.JOptionPane;

public class Main2 {
    public static void main(String[] args) {
        String option = "";
        Vendedor vendedor = null;
        
        do {
            option = JOptionPane.showInputDialog("1 - Cadastrar vendedor\n" + 
                "2 - Calcular venda\n" +
                "3 - Sair");
            if (option == null) System.exit(0);
        
            switch (option) {
                case "1":
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do vendedor:"));
                    String nome = JOptionPane.showInputDialog("Digite o nome do vendedor:");
                    double comissao = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual da comissão:"));
                    vendedor = new Vendedor(codigo, nome, comissao);
                    break;

                case "2":
                    if (vendedor == null) {
                        JOptionPane.showMessageDialog(null, "O vendedor não foi cadastrado.");
                    }
                    else {
                        double valorDesconto = 0;
                        double valorVenda = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da venda:"));
                        char possuiDesconto = (JOptionPane.showInputDialog("Possui desconto?\nS - Sim\nN - Não")).charAt(0);
                        if (possuiDesconto == 'S' || possuiDesconto == 's') {
                            valorDesconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do desconto:"));
                        }
                        JOptionPane.showMessageDialog(null, vendedor.imprimir(valorVenda, valorDesconto));
                    }
                    break;

                case "3":
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
        
        }
        while (!option.equals("3"));
    }
}
