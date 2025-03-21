package controlejeejsf.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

import com.mysql.cj.Query;


import controlejeejsf.*;
import controlejeejsf.model.Document;
public class documentdao {
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("JPA");
	EntityManager em=emf.createEntityManager();
	public List<Document> listdocuments{
		 return em.createQuery("SELECT e FROM Document e", Document.class).getResultList();
	}

}
