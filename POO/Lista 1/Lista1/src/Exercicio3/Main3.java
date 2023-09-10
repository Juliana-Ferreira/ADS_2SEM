package Exercicio3;

import javax.swing.JOptionPane;

public class Main3 {
    public static void main(String[] args) {
        String option = "";
        Funcionario funcionario = null;
        
        do {
            option = JOptionPane.showInputDialog("1 - Criar funcionário\n" + 
                "2 - Mostrar Folha de Pagamento\n" +
                "3 - Alterar remuneração\n" +
                "4 - Sair");
            if (option == null) System.exit(0);
        
            switch (option) {
                case "1":
                    funcionario = new Funcionario();
                    int cracha = Integer.parseInt(JOptionPane.showInputDialog("Digite o crachá do fucionário:"));
                    funcionario.setCracha(cracha);
                    String nome = JOptionPane.showInputDialog("Digite o nome do funcionário:");
                    funcionario.setNome(nome);
                    char tipoVinculo = JOptionPane.showInputDialog("Digite o tipo de vínculo:\n" + 
                            "H - Horista\n" + 
                            "N - Normal").charAt(0);
                    funcionario.setTipoVinculo(tipoVinculo);
                    if (tipoVinculo == 'H' || tipoVinculo == 'h') {
                        float valorHora = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da hora trabalhada:"));
                        funcionario.setValorHora(valorHora);
                        float qtdeHora = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas:"));
                        funcionario.setQtdeHora(qtdeHora);
                    }
                    else {
                        float salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do salário:"));
                        funcionario.setSalario(salario);
                    }
                    float valorDesconto = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do desconto:"));
                    funcionario.setValorDesconto(valorDesconto);
                    break;

                case "2":
                    if (funcionario == null) {
                        JOptionPane.showMessageDialog(null, "O funcionário não foi cadastrado.");
                    }
                    else JOptionPane.showMessageDialog(null, funcionario.imprimir());
                    break;
                    
                case "3":
                    if (funcionario == null) {
                        JOptionPane.showMessageDialog(null, "O funcionário não foi cadastrado.");
                    }
                    else if (funcionario.getTipoVinculo() == 'H' || funcionario.getTipoVinculo() == 'h') {
                        float novoValorHora = Float.parseFloat(JOptionPane.showInputDialog("Digite o novo valor da hora trabalhada:"));
                        funcionario.setValorHora(novoValorHora);
                        float novaQtdeHora = Float.parseFloat(JOptionPane.showInputDialog("Digite a nova quantidade de horas trabalhadas:"));
                        funcionario.setQtdeHora(novaQtdeHora);
                    }
                    else {
                        float novoSalario = Float.parseFloat(JOptionPane.showInputDialog("Digite o novo valor do salário:"));
                        funcionario.setSalario(novoSalario);
                    }
                     break;

                case "4":
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
        
        }
        while (!option.equals("4"));
        
    }
}
