package at.htl.woodManagement.model;

import javax.persistence.*;

@Entity
public class Forest {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Owner owner;


    //region Konstruktoren

    public Forest() {
    }

    public Forest(Owner owner) {
        this.owner = owner;
    }


    //endregion

    //region Getter und Setter

    public Long getId() {
        return id;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    //endregion
}
