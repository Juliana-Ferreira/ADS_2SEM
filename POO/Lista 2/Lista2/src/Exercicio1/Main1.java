package Exercicio1;

import javax.swing.JOptionPane;

public class Main1 {
    public static void main(String[] args) {
        String option = "";
        Apolice apolice = null;
        
        do {
            option = JOptionPane.showInputDialog("1 - Criar Apólice\n" + 
                "2 - Ver dados da Apólice\n" +
                "3 - Sair");
            if (option == null) System.exit(0);
        
            switch (option) {
                case "1":
                    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da apólice:"));
                    String nome = JOptionPane.showInputDialog("Digite o nome do motorista:");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do motorista:"));
                    char sexo = (JOptionPane.showInputDialog("Digite o sexo:\nF - Feminino\nM - Masculino")).charAt(0);
                    double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do automóvel:"));
                    apolice = new Apolice(numero, nome, idade, sexo, valor);
                    apolice.calcularValor();
                    break;

                case "2":
                    if (apolice == null) {
                        JOptionPane.showMessageDialog(null, "A Apólice não foi cadastrada.");
                    }
                    else JOptionPane.showMessageDialog(null, apolice.imprimir());
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
