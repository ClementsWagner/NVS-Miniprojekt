package at.htl.woodManagement.business;

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

    public InitBean(){
    }

    @Transactional
    private void init(@Observes @Initialized(ApplicationScoped.class) Object init){
        System.out.println("My miniproject");
    }
}
