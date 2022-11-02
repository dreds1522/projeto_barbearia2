/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import java.util.ArrayList;
import view.Agenda;

/**
 *
 * @author USER
 */
public class AgendaController {
    
    private final Agenda view;
    private AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizaTabela(){
        
        //Buscar lista com agendamentos do banco de dados
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        
        //Exibir esta lista na view
        helper.preencherTabela(agendamentos);
        
    }
    
    public void atualizaCliente(){
        
        //Buscar clientes do banco de dados
        ClienteDAO clienteDao = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDao.selectAll();
        
        //Exibir clientes no Combobox clientes
        helper.preencherClientes(clientes);        
        
        
    }
    
    public void atualizaServico(){
        
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        
        helper.preencherServicos(servicos);
    }
    
    public void atualizaValor(){
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor());
    }
    
    public void agendar(){
        //Buscar objeto agendamento na tela
        Agendamento agendamento = helper.obterModelo();
       
        //Salvar objeto no banco de dados
        new AgendamentoDAO().insert(agendamento);
       
        //Inserir elemento na tabela
        atualizaTabela();
        helper.limparTela();
    
    }
    
}
