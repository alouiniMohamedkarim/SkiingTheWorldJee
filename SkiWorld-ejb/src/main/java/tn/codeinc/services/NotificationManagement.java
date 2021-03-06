package tn.codeinc.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.codeinc.persistance.CourseNotification;

/**
 * Session Bean implementation class NotificationManagement
 */
@Stateless
@LocalBean
public class NotificationManagement implements NotificationManagementRemote {
	@PersistenceContext
	EntityManager em;
    /**
     * Default constructor. 
     */
    public NotificationManagement() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addNotif(CourseNotification notif) {
		// TODO Auto-generated method stub
		em.persist(notif);
		
	}

	@Override
	public List<CourseNotification> listAll() {
		String requete = "SELECT n FROM Notification n";
		return em.createQuery(requete,CourseNotification.class).getResultList();
	}

}
