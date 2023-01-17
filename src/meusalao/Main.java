package meusalao;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;


public class Main {
    
    public static void main(String[] args){
        String nome = "jefferson";
        System.out.println(nome);
        
        Servico servico = new Servico(1, "henna", 80);
    
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        
        Cliente cliente = new Cliente(1, "lucas", "rua tesle", "67880900");
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario("senha", 1, "jeff");
        System.out.println(usuario.getNome());  
        
        Agendamento agendamento = new Agendamento(1, cliente, servico, 80, "09/09/2022 09:30");
        System.out.println(agendamento.getCliente().getNome());
        
    }
}

