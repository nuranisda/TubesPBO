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
@Table(name = "anggota", catalog = "perpustakaan", schema = "")
@NamedQueries({
    @NamedQuery(name = "Anggota.findAll", query = "SELECT a FROM Anggota a"),
    @NamedQuery(name = "Anggota.findByIdAnggota", query = "SELECT a FROM Anggota a WHERE a.idAnggota = :idAnggota"),
    @NamedQuery(name = "Anggota.findByNama", query = "SELECT a FROM Anggota a WHERE a.nama = :nama"),
    @NamedQuery(name = "Anggota.findByJk", query = "SELECT a FROM Anggota a WHERE a.jk = :jk"),
    @NamedQuery(name = "Anggota.findByNoHp", query = "SELECT a FROM Anggota a WHERE a.noHp = :noHp"),
    @NamedQuery(name = "Anggota.findByAlamat", query = "SELECT a FROM Anggota a WHERE a.alamat = :alamat"),
    @NamedQuery(name = "Anggota.findByUsername", query = "SELECT a FROM Anggota a WHERE a.username = :username"),
    @NamedQuery(name = "Anggota.findByPassword", query = "SELECT a FROM Anggota a WHERE a.password = :password")})
public class Anggota implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_anggota")
    private String idAnggota;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "jk")
    private String jk;
    @Basic(optional = false)
    @Column(name = "no_hp")
    private String noHp;
    @Basic(optional = false)
    @Column(name = "alamat")
    private String alamat;
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;

    public Anggota() {
    }

    public Anggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    public Anggota(String idAnggota, String nama, String jk, String noHp, String alamat, String username, String password) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.jk = jk;
        this.noHp = noHp;
        this.alamat = alamat;
        this.username = username;
        this.password = password;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(String idAnggota) {
        String oldIdAnggota = this.idAnggota;
        this.idAnggota = idAnggota;
        changeSupport.firePropertyChange("idAnggota", oldIdAnggota, idAnggota);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        String oldNama = this.nama;
        this.nama = nama;
        changeSupport.firePropertyChange("nama", oldNama, nama);
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        String oldJk = this.jk;
        this.jk = jk;
        changeSupport.firePropertyChange("jk", oldJk, jk);
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        String oldNoHp = this.noHp;
        this.noHp = noHp;
        changeSupport.firePropertyChange("noHp", oldNoHp, noHp);
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        String oldAlamat = this.alamat;
        this.alamat = alamat;
        changeSupport.firePropertyChange("alamat", oldAlamat, alamat);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        String oldUsername = this.username;
        this.username = username;
        changeSupport.firePropertyChange("username", oldUsername, username);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAnggota != null ? idAnggota.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Anggota)) {
            return false;
        }
        Anggota other = (Anggota) object;
        if ((this.idAnggota == null && other.idAnggota != null) || (this.idAnggota != null && !this.idAnggota.equals(other.idAnggota))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Login.Anggota[ idAnggota=" + idAnggota + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
