/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author #RIGBY MULTIMEDIA
 */
@Entity
@Table(name = "data_buku", catalog = "perpustakaan", schema = "")
@NamedQueries({
    @NamedQuery(name = "DataBuku.findAll", query = "SELECT d FROM DataBuku d"),
    @NamedQuery(name = "DataBuku.findByIdBuku", query = "SELECT d FROM DataBuku d WHERE d.idBuku = :idBuku"),
    @NamedQuery(name = "DataBuku.findByJudulBuku", query = "SELECT d FROM DataBuku d WHERE d.judulBuku = :judulBuku"),
    @NamedQuery(name = "DataBuku.findByPenerbit", query = "SELECT d FROM DataBuku d WHERE d.penerbit = :penerbit"),
    @NamedQuery(name = "DataBuku.findByPengarang", query = "SELECT d FROM DataBuku d WHERE d.pengarang = :pengarang"),
    @NamedQuery(name = "DataBuku.findByStok", query = "SELECT d FROM DataBuku d WHERE d.stok = :stok")})
public class DataBuku implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_buku")
    private String idBuku;
    @Basic(optional = false)
    @Column(name = "judul_buku")
    private String judulBuku;
    @Basic(optional = false)
    @Column(name = "penerbit")
    private String penerbit;
    @Basic(optional = false)
    @Column(name = "pengarang")
    private String pengarang;
    @Basic(optional = false)
    @Column(name = "stok")
    private int stok;

    public DataBuku() {
    }

    public DataBuku(String idBuku) {
        this.idBuku = idBuku;
    }

    public DataBuku(String idBuku, String judulBuku, String penerbit, String pengarang, int stok) {
        this.idBuku = idBuku;
        this.judulBuku = judulBuku;
        this.penerbit = penerbit;
        this.pengarang = pengarang;
        this.stok = stok;
    }

    public String getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(String idBuku) {
        String oldIdBuku = this.idBuku;
        this.idBuku = idBuku;
        changeSupport.firePropertyChange("idBuku", oldIdBuku, idBuku);
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        String oldJudulBuku = this.judulBuku;
        this.judulBuku = judulBuku;
        changeSupport.firePropertyChange("judulBuku", oldJudulBuku, judulBuku);
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        String oldPenerbit = this.penerbit;
        this.penerbit = penerbit;
        changeSupport.firePropertyChange("penerbit", oldPenerbit, penerbit);
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        String oldPengarang = this.pengarang;
        this.pengarang = pengarang;
        changeSupport.firePropertyChange("pengarang", oldPengarang, pengarang);
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        int oldStok = this.stok;
        this.stok = stok;
        changeSupport.firePropertyChange("stok", oldStok, stok);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBuku != null ? idBuku.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataBuku)) {
            return false;
        }
        DataBuku other = (DataBuku) object;
        if ((this.idBuku == null && other.idBuku != null) || (this.idBuku != null && !this.idBuku.equals(other.idBuku))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Login.DataBuku[ idBuku=" + idBuku + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
