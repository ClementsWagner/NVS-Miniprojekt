package at.htl.woodManagement.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Tree {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date cutDate;
    @ManyToOne
    private TreeType treeType;
    @ManyToOne
    private Sector sector;
    //region Konstruktoren

    public Tree() {
    }

    public Tree(TreeType treeType) {
        this.treeType = treeType;
    }

    public Tree(TreeType treeType, Sector sector) {
        this.treeType = treeType;
        this.sector = sector;
    }

    //endregion

    //region Getter und Setter
    public Long getId() {
        return id;
    }

    public Date getCutDate() {
        return cutDate;
    }

    public void setCutDate(Date cutDate) {
        this.cutDate = cutDate;
    }

    public TreeType getTreeType() {
        return treeType;
    }

    public void setTreeType(TreeType treeType) {
        this.treeType = treeType;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }
//endregion

}
