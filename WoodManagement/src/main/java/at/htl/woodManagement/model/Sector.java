package at.htl.woodManagement.model;

import javax.persistence.*;

@Entity
public class Sector {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sectorLabel;
    @ManyToOne
    private Forest forest;

    //region Konstruktoren

    public Sector() {
    }

    public Sector(String sectorLabel) {
        this.sectorLabel = sectorLabel;
    }

    public Sector(String sectorLabel, Forest forest) {
        this.sectorLabel = sectorLabel;
        this.forest = forest;
    }
    //endregion


    //region Getter und Setter

    public Forest getForest() {
        return forest;
    }

    public void setForest(Forest forest) {
        this.forest = forest;
    }

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
