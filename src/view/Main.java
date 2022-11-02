/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import Model.Cliente;
import Model.Pessoa;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author USER
 */
public class Main {
    
    public static void main(String[] args){
    
        String nome = "André Sampaio";
        System.out.println(nome);
        
        Servico servico = new Servico(1, "barba", 30);
        
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        
        Cliente cliente = new Cliente(1, "André", "Rua Anhambus", "26065-070");
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario(1, "Barbaeiro", "senha 2");
        System.out.println(usuario.getNome());
        
        Model.Agendamento agendamento = new Model.Agendamento(1, cliente, servico, 30, "28/09/2022 09:15");
        System.out.println(agendamento.getCliente().getNome());
     
        
        
      
    
    }
    
}
