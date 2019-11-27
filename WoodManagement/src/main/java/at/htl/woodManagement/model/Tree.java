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

    //region Konstruktoren

    public Tree() {
    }

    public Tree(TreeType treeType) {
        this.treeType = treeType;
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

    //endregion

}
