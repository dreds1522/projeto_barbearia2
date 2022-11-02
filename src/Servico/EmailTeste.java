/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servico;

/**
 *
 * @author Denner Dias
 */
public class EmailTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        
        Email email = new Email(
                "Assunto da barbearia", 
                "Mensagem padrão do sistema da barbearia", 
                "andresampaio37@outlook.com");
        
        email.enviar();
        

    }
    
}
