/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tinh.nuguen
 */
@Entity
@Table(name = "testid")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Testid.findAll", query = "SELECT t FROM Testid t"),
    @NamedQuery(name = "Testid.findByMess", query = "SELECT t FROM Testid t WHERE t.mess = :mess"),
    @NamedQuery(name = "Testid.findByName", query = "SELECT t FROM Testid t WHERE t.name = :name"),
    @NamedQuery(name = "Testid.findById", query = "SELECT t FROM Testid t WHERE t.id = :id")})
public class Testid implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "Mess")
    private Integer mess;
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    public Testid() {
    }

    public Testid(Integer id) {
        this.id = id;
    }

    public Integer getMess() {
        return mess;
    }

    public void setMess(Integer mess) {
        this.mess = mess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Testid)) {
            return false;
        }
        Testid other = (Testid) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Testid[ id=" + id + " ]";
    }
    
}
