package HIBB.JPA;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-persistence-unit");
        EntityManager em = emf.createEntityManager();

        // Persist a new song
        em.getTransaction().begin();

        Song song = new Song();
        song.setTitle("T1");
        song.setArtist("A1");
        song.setAlbum("a1");

        em.persist(song);

        em.getTransaction().commit();

        // Find a song by ID
        Song foundSong = em.find(Song.class, 1);
        System.out.println("Found song: " + foundSong.getTitle() + " by " + foundSong.getArtist());

        em.close();
        emf.close();
    }
}
