package exercicio_heranca;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        ArrayList<Imovel> imoveis = new ArrayList<>();
        int option;
        
        do{
            option = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção:\n" + 
                "1 – Inserir imóvel\n" + 
                "2 – Exibir Imóveis\n" + 
                "3 - Sair"));
            
            switch(option) {
                case 1:
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do imóvel:"));
                    String endereco = JOptionPane.showInputDialog("Digite o endereço do imóvel:");
                    double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do imóvel:"));
                    int op;
                    
                    do {
                        op = Integer.parseInt(JOptionPane.showInputDialog("O imóvel é:\n1 - Novo\n2 - Velho"));
                        if(op == 1) {
                            double valorAdicional = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor adicional do imóvel:"));
                            ImovelNovo imovel = new ImovelNovo(codigo, endereco, valor, valorAdicional);
                            imoveis.add(imovel);
                        }
                        else if (op == 2) {
                            double valorDesconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do desconto do imóvel:"));
                            ImovelVelho imovel = new ImovelVelho(codigo, endereco, valor, valorDesconto);
                            imoveis.add(imovel);
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Opção incorreta");
                        }
                    }
                    while (op != 1 && op != 2);
                    break;
                    
                case 2:
                    for (Imovel n : imoveis) {
                        JOptionPane.showMessageDialog(null, n.imprimir());
                    }
                    break;
                    
                case 3:
                    System.exit(0);
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opção incorreta.");
            }
        }
        while (option != 3);
        
    }
}
