package Exercicio1;

import javax.swing.JOptionPane;

public class Main1 {
    public static void main(String[] args) {
        String option = "";
        Pessoa pessoa = null;
        
        do {
            option = JOptionPane.showInputDialog("1 - Criar pessoa\n" + 
                "2 - Mostrar pessoa\n" +
                "3 - Sair");
            if (option == null) System.exit(0);
        
            switch (option) {
                case "1":
                    String cpf = JOptionPane.showInputDialog("Digite o CPF:");
                    String nome = JOptionPane.showInputDialog("Digite o nome:");
                    char sexo = (JOptionPane.showInputDialog("Digite o sexo:\nF - Feminino\nM - Masculino")).charAt(0);
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));

                    pessoa = new Pessoa();
                    pessoa.setCpf(cpf);
                    pessoa.setNome(nome);
                    pessoa.setSexo(sexo);
                    pessoa.setIdade(idade);

                    break;

                case "2":
                    if (pessoa == null) {
                        JOptionPane.showMessageDialog(null, "A pessoa não foi cadastrada.");
                    }
                    else JOptionPane.showMessageDialog(null, pessoa.imprimir());

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
