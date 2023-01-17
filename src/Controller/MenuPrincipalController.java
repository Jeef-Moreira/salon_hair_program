package Controller;

import meusalao.AgendamentoMarcardo;
import meusalao.InicialCliente;
import meusalao.InicialCliente.meusalao;
import meusalao.MeuPerfil;
import meusalao.NovoAgendamento;
import meusalao.NovoCliente;
import meusalao.Procedimentos;
import meusalao.SobreNos;

public class MenuPrincipalController {
    
    private final InicialCliente meusalao;

    public MenuPrincipalController(InicialCliente meusalao ) {
        this.meusalao = meusalao;
    }
    
    public void navegarParaAgenda(){
        NovoAgendamento agendamento = new NovoAgendamento();
        agendamento.setVisible(true);
        
    }
    
    public void navegarParaAgendamento(){
        AgendamentoMarcardo agendado = new AgendamentoMarcardo();
        agendado.setVisible(true);
    
    }
    
    public void navegarParaProcedimentos(){
        Procedimentos procedimento = new Procedimentos();
        procedimento.setVisible(true);
    
    }
    
    public void navegarParaMeuPerfil(){
        MeuPerfil perfil = new MeuPerfil();
        perfil.setVisible(true);

    }
    
    public void navegarParaSobreNos(){
        SobreNos sobre = new SobreNos();
        sobre.setVisible(true);
    }
   
}
    
