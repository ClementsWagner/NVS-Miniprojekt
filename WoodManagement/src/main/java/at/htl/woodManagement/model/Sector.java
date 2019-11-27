package at.htl.woodManagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sector {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sectorLabel;


    //region Konstruktoren

    public Sector() {
    }

    public Sector(String sectorLabel) {
        this.sectorLabel = sectorLabel;
    }

    //endregion


    //region Getter und Setter

    public Long getId() {
        return id;
    }

    public String getSectorLabel() {
        return sectorLabel;
    }

    public void setSectorLabel(String sectorLabel) {
        this.sectorLabel = sectorLabel;
    }

    //endregion

}
