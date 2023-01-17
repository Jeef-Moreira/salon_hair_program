package Controller;

import Controller.Helper.AgendamentoHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import java.util.ArrayList;
import meusalao.NovoAgendamento;

public class AgendaController {
    
    private final NovoAgendamento meusalao;
    private final AgendamentoHelper helper;

    public AgendaController(NovoAgendamento meusalao) {
        this.meusalao = meusalao;
        this.helper = new AgendamentoHelper(meusalao);
    }
    
    public void atualizaTabela(){
        //Busca por lista com agendamentos do banco de dados
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        
        //Exibir esta lista no meusalao
        helper.preencherTabela(agendamentos);
        
    }

    public void atualizaCliente() {
        //Buscar cliente no Banco de Dados
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
        //Exibir clientes no ComboBox Cliente
        helper.preencherClientes(clientes);
        
    }
    
    public void atualizaServico(){
        //Buscar serviço no Banco de Dados
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        
        //Exibir serviços no ComboBox Serviço
        helper.preencherServicos(servicos);
        
        }
    
    public void atualizaValor(){
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor());
        }
    
    public void agendar(){ //P
        //Buscar Objeto Agendamento da Tela
        Agendamento agendamento = helper.obterModelo();
        //Salvar Objeto no Banco de Dados
        new AgendamentoDAO().insert(agendamento);
        //Inserir elemento na tabela
        atualizaTabela();
        helper.limparTela();
       
    }
    }
    

    

