package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import meusalao.InicialCliente;
import meusalao.TelaInicialGerente;

public class LoginController {

    private final TelaInicialGerente meusalao;
    private LoginHelper helper;

    public LoginController(TelaInicialGerente meusalao) {
        this.meusalao = meusalao;
        this.helper = new LoginHelper(meusalao);
    }
    
    public void entrarNoSistema(){
        Usuario usuario = helper.obterModelo();
        //Pegar um Usuário da TelaIncialGerente
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        //Pesquisa Usuario no Banco
        
        if(usuarioAutenticado != null){
            InicialCliente menu = new InicialCliente();
            menu.setVisible(true);
            this.meusalao.dispose();
        }else{
            meusalao.exibeMensagem("Usuario ou senha invalidos");
        }
    
    
    
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        
        this.meusalao.exibeMensagem("Executei o fiz tarefa");
        //LoginController é o responsável por dizer qual será a mensagem exibida
    }
}
