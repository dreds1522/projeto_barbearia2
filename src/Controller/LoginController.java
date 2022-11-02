/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import view.Login;
import view.MenuPrincipal;

/**
 *
 * @author USER
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    
    public void entrarNoSistema(){
  
        //Pegar um usuário da view
        Usuario usuario = helper.obterModelo();
        
        
        //Pesquisar usuário no banco de dados
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        
        //Se o usuário da view tiver o mesmo usuário e senha que o usuário vindo do banco, direcionar para menu
        if(usuarioAutenticado != null){ //Se usuário autenticado for diferente de nulo, vá para menu principal.
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
            
        } else{ //Senão, mostrar uma mensagem ao usuário "Usário e senha inválidos".
            view.exibeMensagem("Usuário e senha inválidos");
        }
        
        
        
    }
    
    
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        
        this.view.exibeMensagem("Executei o Fiz tarefa");
    
    }
    
    
    
}
