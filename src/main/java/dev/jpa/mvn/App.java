package dev.jpa.mvn;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dev.jpa.mvn.domain.Contact;

public class App {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("digi-book-jpa");
		EntityManager em = emf.createEntityManager();

		// CREATION OU INSERT INTO
		em.getTransaction().begin();

		Contact contact = em.find(Contact.class, 4l);
		System.out.println(contact.getEmail());
		em.remove(contact);

		// INTEGRER A LA BASE
		em.getTransaction().commit();

//		List<Contact> list = em.createQuery("from Contact", Contact.class).getResultList();
//		for (Contact c : list) {
//			System.out.println(c);
//		}
//		System.out.println();
//		List<Address> listA = em.createQuery("from Address", Address.class).getResultList();
//		for (Address a : listA) {
//			System.out.println(a);
//		}

		em.close();
		emf.close();
	}

}
