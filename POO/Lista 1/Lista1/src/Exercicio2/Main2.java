package Exercicio2;

import javax.swing.JOptionPane;

public class Main2 {
    public static void main(String[] args) {
        String option = "";
        Aluno aluno = null;
        
        do {
            option = JOptionPane.showInputDialog("1 - Criar aluno\n" + 
                "2 - Mostrar aluno\n" +
                "3 - Sair");
            if (option == null) System.exit(0);
        
            switch (option) {
                case "1":
                    String ra = JOptionPane.showInputDialog("Digite o RA:");
                    String nome = JOptionPane.showInputDialog("Digite o nome:");
                    float ac1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da AC1:"));
                    float ac2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da AC2:"));
                    float ag = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da AG:"));
                    float af = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da AF:"));

                    aluno = new Aluno();
                    aluno.setRa(ra);
                    aluno.setNome(nome);
                    aluno.setAc1(ac1);
                    aluno.setAc2(ac2);
                    aluno.setAg(ag);
                    aluno.setAf(af);
                    break;

                case "2":
                    if (aluno == null) {
                        JOptionPane.showMessageDialog(null, "O aluno não foi cadastrado.");
                    }
                    else JOptionPane.showMessageDialog(null, aluno.imprimir());
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
