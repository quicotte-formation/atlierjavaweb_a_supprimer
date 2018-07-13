/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.service;

import atos.shop.dao.ClientDAO;
import atos.shop.entity.Client;

/**
 *
 * @author quico
 */
public class ClientService {
    
    private ClientDAO dao = new ClientDAO();
    
    /**
     * 
     * @param pseudo Le pseudo
     * @param mdp Le mot de passe
     * @return 
     */
    public Client connexion(String pseudo, String mdp){
        return dao.findByLoginAndMdp(pseudo, mdp);
    }

    public void ajouter(Client cli) {
        dao.ajouter(cli);
    }
}
