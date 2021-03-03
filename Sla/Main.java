package Sla;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

import Sla.Funcionarios.Gerente;
import Sla.Funcionarios.Atendente;
import Sla.Funcionarios.Vendedor;

public class Main {
    public static void main(String[] args) {
        //Listas
        Object[] options = {"Cadastrar", "Exibir"};
        Object[] cadastro = {"Cliente", "Funcionário", "Produto"};
        Object[] cargos = {"Gerente", "Atendente", "Vendedor"};

        //ArrayList
        //ArrayList<String> lista_clientes = new ArrayList<String>();
        List<Gerente> lista_gerente = new ArrayList<>();
        List<Atendente> lista_atendente = new ArrayList<>();
        List<Vendedor> lista_vendedor = new ArrayList<>();

        //Variáveis
        int opc, opc_cadastro, opc_exibir;

        while(true) {
            //Cadastras ou Exibir
            opc = JOptionPane.showOptionDialog(null, "Escolha uma opção abaixo:","Sistema Panelinha", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, options, options[0]);

            switch (opc) {
                //Cadastro
                case 0:
                    opc_cadastro = JOptionPane.showOptionDialog(null, "Escolha uma opção abaixo:","Sistema Panelinha", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, cadastro, cadastro[0]);

                    switch (opc_cadastro) {
                        case 0:
                            //Cadastro do Gerente
                            Gerente gerente = new Gerente();
                            gerente.cadastrarGerente();
                            lista_gerente.add(gerente);
                            break;

                        case 1:
                            //Cadastro do Atendente
                            Atendente atendente = new Atendente();
                            atendente.cadastrarAtendente();
                            lista_atendente.add(atendente);
                            break;
                        
                        case 2:
                            //Cadastro do Vendedor
                            Vendedor vendedor = new Vendedor();
                            vendedor.cadastrarVendedor();
                            lista_vendedor.add(vendedor);
                            break;
                    
                        default:
                            break;
                    }
                //Exibir
                case 1:
                    opc_exibir = JOptionPane.showOptionDialog(null, "O que deseja Exibir:","Exibir Panelinha", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, cadastro, cadastro[0]);

                    switch (opc_exibir) {
                        case 0:
                            //Exibir Clientes
                            break;
                        
                        case 1:
                            Gerente g = new Gerente();
                            for(Gerente gerente: lista_gerente) {
                                gerente.exibirGerente();
                            }

                        default:
                            break;
                    }
            
            }
        }
    }
}
