package Controller.Helper;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import meusalao.NovoAgendamento;

public class AgendamentoHelper implements IHelper{//Implementa a classe IHelper assim como o LoginHelper
    
    private final NovoAgendamento meusalao;

    public AgendamentoHelper(NovoAgendamento meusalao) {
        this.meusalao = meusalao;
    }
    
   public void preencherTabela(ArrayList<Agendamento> agendamentos){
       
       DefaultTableModel tableModel = (DefaultTableModel) meusalao.getTableAgendamentos().getModel();
       tableModel.setNumRows(0);
       
       //Percorrer a lista preenchendo o table model
       for (Agendamento agendamento : agendamentos) {
           
           tableModel.addRow(new Object[]{
               
               agendamento.getId(),
               agendamento.getCliente().getNome(),
               agendamento.getServico().getDescricao(),
               agendamento.getValor(),
               agendamento.getDataFormatada(),
               agendamento.getHoraFormatada(),
               agendamento.getObservacao()
           } );
        
           }
   }

 
    public void preencherClientes(ArrayList<Cliente> clientes) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) meusalao.getJComboBoxCliente().getModel();
        
        for (Cliente cliente : clientes) {
            
            comboBoxModel.addElement(cliente);// aqui esta o truque exibe a referencia do objeto
            
        }
    }

    public void preencherServicos(ArrayList<Servico> servicos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) meusalao.getJComboBoxServico().getModel();
        
        for (Servico servico : servicos) {
            
            comboBoxModel.addElement(servico);
            
        }
    }
    
    public Cliente obterCliente() {
        return (Cliente) meusalao.getJComboBoxCliente().getSelectedItem();
    }

    public Servico obterServico() {
        return (Servico) meusalao.getJComboBoxServico().getSelectedItem();
    }

    public void setarValor(float valor) {
        meusalao.getTextValor().setText(valor+"");//Concactenação de Int + String virá String
    }

    @Override
    public Agendamento obterModelo() {
        
        String idString = meusalao.getTextID().getText();
        int id = Integer.parseInt(idString);
        Cliente cliente = obterCliente();
        Servico servico = obterServico();
        String valorString = meusalao.getTextValor().getText();
        float valor = Float.parseFloat(valorString);
        String data = meusalao.getBxData().getText();
        String hora = meusalao.getTxtHora().getText();
        if(hora== null || hora.isEmpty())
            hora = "00:00";
        String dataHora = data + " " + hora;
        String observacao = meusalao.getTextObservacao().getText();
        
        Agendamento agendamento = new Agendamento(id, cliente, servico, valor, dataHora,observacao);
        return agendamento;
        //new Agendamento();
    }

    @Override
    public void limparTela() {
        meusalao.getTextID().setText("0");
        meusalao.getBxData().setText("");
        meusalao.getTxtHora().setText("");
        meusalao.getTextObservacao().setText("");
    }
    
}
