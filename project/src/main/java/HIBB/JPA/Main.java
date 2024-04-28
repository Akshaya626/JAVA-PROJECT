
package HIBB.JPA;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;

        try {
            // Create EntityManagerFactory
            entityManagerFactory = Persistence.createEntityManagerFactory("hibernate-persistence-unit");

            // Create EntityManager
            entityManager = entityManagerFactory.createEntityManager();

            // Begin transaction
            entityManager.getTransaction().begin();

            // Create and persist a Song object
            Song song1 = new Song();
            song1.setId(1);
            song1.setSongName("Broken Angel");
            song1.setArtist("Akon");

            entityManager.persist(song1);

            // Commit transaction
            entityManager.getTransaction().commit();
        } finally {
            // Close EntityManager and EntityManagerFactory
            if (entityManager != null) {
                entityManager.close();
            }
            if (entityManagerFactory != null) {
                entityManagerFactory.close();
            }
        }
    }
}
