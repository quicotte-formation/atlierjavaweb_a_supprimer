/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.dao;

import atos.shop.entity.Client;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

/**
 *
 * @author quico
 */
public class ClientDAO {

    /**
     * 
     * @param login
     * @param mdp
     * @return null si pas trouvé
     */
    public Client findByLoginAndMdp(String login, String mdp) {

        try {
            EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

            return (Client) em.createQuery("SELECT c FROM Client c WHERE c.login=:log AND c.mdp=:pwd")
                    .setParameter("pwd", mdp).setParameter("log", login).getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    public void ajouter(Client cli) {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        em.persist(cli);
        em.getTransaction().commit();
    }
}
