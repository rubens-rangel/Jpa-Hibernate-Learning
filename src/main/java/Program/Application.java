package Program;

import Dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(null,"Carlos","Carlos@gmail.com");
        Pessoa p2 = new Pessoa(null,"ze","ze@gmail.com");
        Pessoa p3 = new Pessoa(null,"ana","ana@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        /*create
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();
        */

        /* find
        Pessoa p = em.find(Pessoa.class,2);
        */

        /*remove
        Pessoa p = em.find(Pessoa.class,2);
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
        */

        System.out.println("Pronto");
        em.close();
        emf.close();
    }
}
