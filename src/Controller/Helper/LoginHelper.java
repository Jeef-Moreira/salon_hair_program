package Controller.Helper;

import Model.Usuario;
import meusalao.TelaInicialGerente;

public class LoginHelper implements IHelper{//Ele implementa a classe IHelper
    
    private final TelaInicialGerente meusalao;
    
    public LoginHelper(TelaInicialGerente meusalao){
        this.meusalao = meusalao;
    }
    
    public Usuario obterModelo(){
        String nome = meusalao.getTxtLoginGerente().getText();
        String senha = meusalao.getTxtSenhaGerente().getText();  
        Usuario modelo = new Usuario(senha, 0, nome);
        return modelo;
        
    }
    
    public void setarModelo(Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        meusalao.getTxtLoginGerente().setText(nome);
        meusalao.getTxtSenhaGerente().setText(senha);
    }
    
    public void limparTela(){
        meusalao.getTxtLoginGerente().setText("");
        meusalao.getTxtSenhaGerente().setText("");
    }
    
    
    
    
}
