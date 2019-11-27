package at.htl.woodManagement.business;

import at.htl.woodManagement.model.*;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.Month;

@ApplicationScoped
public class InitBean {

    @PersistenceContext
    EntityManager em;

    public InitBean(){
    }

    @Transactional
    private void init(@Observes @Initialized(ApplicationScoped.class) Object init){
        System.out.println("My miniproject");

        Owner o = new Owner("Hans Herbert", "Wiesenring 4, Pasching", "133");
        em.persist(o);
        Forest f = new Forest(o);
        em.persist(f);
        Sector s = new Sector("Sektor A", f);
        TreeType t = new TreeType("Fichte");
        em.persist(t);
        em.persist(s);
        Tree tree = new Tree(t, s);
        em.persist(tree);
    }
}
