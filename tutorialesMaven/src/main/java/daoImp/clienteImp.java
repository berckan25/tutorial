package daoImp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.Icliente;
import tutorialesMaven.Tblcliente;

public class clienteImp implements Icliente{

	@Override
	public void RegistrarCleinte(Tblcliente tblcliente) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("tutorialesMaven");
		
		EntityManager em = emf.createEntityManager();
		
		try {
			
			em.getTransaction().begin();
			
			em.persist(tblcliente);
			
			em.getTransaction().commit();
			
		} catch (RuntimeException e) {
			e.getMessage();
		}finally {
			em.close();
		}
		
	}

}
