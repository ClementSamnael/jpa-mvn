package dev.jpa.mvn.domain;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("digi-book-jpa");
		EntityManager em = emf.createEntityManager();

		List<Contact> list = em.createQuery("from Contact", Contact.class).getResultList();
		for (Contact c : list) {
			System.out.println(c);
		}

//		Contact contact = new Contact("root", "");
//		em.getTransaction().begin();
//		em.persist(contact);
//		em.getTransaction().commit();

		em.close();
		emf.close();
	}

}
