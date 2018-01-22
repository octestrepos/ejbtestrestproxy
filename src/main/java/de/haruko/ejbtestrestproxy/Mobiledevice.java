/**
* $HeadURL$
* $LastChangedRevision$
* $LastChangedDate$
* $Author$
* Created on 20.01.2018, 13:42:17
* ===========================================================================
* Copyright (c) 2006-2018 OrgaCard Siemantel & Alt GmbH. All rights reserved.
*/

package de.haruko.ejbtestrestproxy;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "MOBILEDEVICES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mobiledevice.findAll", query = "SELECT m FROM Mobiledevice m")
    , @NamedQuery(name = "Mobiledevice.findByMdevGuid", query = "SELECT m FROM Mobiledevice m WHERE m.mdevGuid = :mdevGuid")
    , @NamedQuery(name = "Mobiledevice.findByMdevName", query = "SELECT m FROM Mobiledevice m WHERE m.mdevName = :mdevName")
    , @NamedQuery(name = "Mobiledevice.findByMdevIsbedcenter", query = "SELECT m FROM Mobiledevice m WHERE m.mdevIsbedcenter = :mdevIsbedcenter")
    , @NamedQuery(name = "Mobiledevice.findByMdevValidfrom", query = "SELECT m FROM Mobiledevice m WHERE m.mdevValidfrom = :mdevValidfrom")
    , @NamedQuery(name = "Mobiledevice.findByMdevValidto", query = "SELECT m FROM Mobiledevice m WHERE m.mdevValidto = :mdevValidto")
    , @NamedQuery(name = "Mobiledevice.findByMdevOcnew", query = "SELECT m FROM Mobiledevice m WHERE m.mdevOcnew = :mdevOcnew")
    , @NamedQuery(name = "Mobiledevice.findByMdevUsernew", query = "SELECT m FROM Mobiledevice m WHERE m.mdevUsernew = :mdevUsernew")
    , @NamedQuery(name = "Mobiledevice.findByMdevOcmod", query = "SELECT m FROM Mobiledevice m WHERE m.mdevOcmod = :mdevOcmod")
    , @NamedQuery(name = "Mobiledevice.findByMdevUsermod", query = "SELECT m FROM Mobiledevice m WHERE m.mdevUsermod = :mdevUsermod")
    , @NamedQuery(name = "Mobiledevice.findByMdevSortno", query = "SELECT m FROM Mobiledevice m WHERE m.mdevSortno = :mdevSortno")
    , @NamedQuery(name = "Mobiledevice.findByMdevLocked", query = "SELECT m FROM Mobiledevice m WHERE m.mdevLocked = :mdevLocked")
    , @NamedQuery(name = "Mobiledevice.findByMdevPushForeignDeviceid", query = "SELECT m FROM Mobiledevice m WHERE m.mdevPushForeignDeviceid = :mdevPushForeignDeviceid")
    , @NamedQuery(name = "Mobiledevice.findByMdevPushIsready", query = "SELECT m FROM Mobiledevice m WHERE m.mdevPushIsready = :mdevPushIsready")
    , @NamedQuery(name = "Mobiledevice.findByMdevPushMasterdatastate", query = "SELECT m FROM Mobiledevice m WHERE m.mdevPushMasterdatastate = :mdevPushMasterdatastate")
    , @NamedQuery(name = "Mobiledevice.findByMdevPushSequencenumber", query = "SELECT m FROM Mobiledevice m WHERE m.mdevPushSequencenumber = :mdevPushSequencenumber")
    , @NamedQuery(name = "Mobiledevice.findByMdevStatemod", query = "SELECT m FROM Mobiledevice m WHERE m.mdevStatemod = :mdevStatemod")
    , @NamedQuery(name = "Mobiledevice.findByMdevStatemoduser", query = "SELECT m FROM Mobiledevice m WHERE m.mdevStatemoduser = :mdevStatemoduser")
    , @NamedQuery(name = "Mobiledevice.findByMdevPushIsactive", query = "SELECT m FROM Mobiledevice m WHERE m.mdevPushIsactive = :mdevPushIsactive")
    , @NamedQuery(name = "Mobiledevice.findByMdevCleanoruncleanonly", query = "SELECT m FROM Mobiledevice m WHERE m.mdevCleanoruncleanonly = :mdevCleanoruncleanonly")
    , @NamedQuery(name = "Mobiledevice.findByMdevIspreparationdevice", query = "SELECT m FROM Mobiledevice m WHERE m.mdevIspreparationdevice = :mdevIspreparationdevice")
    , @NamedQuery(name = "Mobiledevice.findByMdevIsorderdevice", query = "SELECT m FROM Mobiledevice m WHERE m.mdevIsorderdevice = :mdevIsorderdevice")
    , @NamedQuery(name = "Mobiledevice.findByMdevIscleaningdevice", query = "SELECT m FROM Mobiledevice m WHERE m.mdevIscleaningdevice = :mdevIscleaningdevice")
    , @NamedQuery(name = "Mobiledevice.findByMdevIstransportdevice", query = "SELECT m FROM Mobiledevice m WHERE m.mdevIstransportdevice = :mdevIstransportdevice")
    , @NamedQuery(name = "Mobiledevice.findByMdevBedcenterGuid", query = "SELECT m FROM Mobiledevice m WHERE m.mdevBedcenterGuid = :mdevBedcenterGuid")
    , @NamedQuery(name = "Mobiledevice.findByMdevTeamGuid", query = "SELECT m FROM Mobiledevice m WHERE m.mdevTeamGuid = :mdevTeamGuid")})
public class Mobiledevice implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "MDEV_GUID")
    private String mdevGuid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "MDEV_NAME")
    private String mdevName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_ISBEDCENTER")
    private short mdevIsbedcenter;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_VALIDFROM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdevValidfrom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_VALIDTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdevValidto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_OCNEW")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdevOcnew;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "MDEV_USERNEW")
    private String mdevUsernew;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_OCMOD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdevOcmod;
    @Size(max = 50)
    @Column(name = "MDEV_USERMOD")
    private String mdevUsermod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_SORTNO")
    private int mdevSortno;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_LOCKED")
    private short mdevLocked;
    @Size(max = 50)
    @Column(name = "MDEV_PUSH_FOREIGN_DEVICEID")
    private String mdevPushForeignDeviceid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_PUSH_ISREADY")
    private short mdevPushIsready;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_PUSH_MASTERDATASTATE")
    private int mdevPushMasterdatastate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_PUSH_SEQUENCENUMBER")
    private long mdevPushSequencenumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_STATEMOD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdevStatemod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "MDEV_STATEMODUSER")
    private String mdevStatemoduser;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_PUSH_ISACTIVE")
    private short mdevPushIsactive;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_CLEANORUNCLEANONLY")
    private short mdevCleanoruncleanonly;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_ISPREPARATIONDEVICE")
    private short mdevIspreparationdevice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_ISORDERDEVICE")
    private short mdevIsorderdevice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_ISCLEANINGDEVICE")
    private short mdevIscleaningdevice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MDEV_ISTRANSPORTDEVICE")
    private short mdevIstransportdevice;
    @Size(max = 50)
    @Column(name = "MDEV_BEDCENTER_GUID")
    private String mdevBedcenterGuid;
    @Size(max = 50)
    @Column(name = "MDEV_TEAM_GUID")
    private String mdevTeamGuid;

    public Mobiledevice() {
    }

    public Mobiledevice(String mdevGuid) {
        this.mdevGuid = mdevGuid;
    }

    public Mobiledevice(String mdevGuid, String mdevName, short mdevIsbedcenter, Date mdevValidfrom, Date mdevValidto, Date mdevOcnew, String mdevUsernew, Date mdevOcmod, int mdevSortno, short mdevLocked, short mdevPushIsready, int mdevPushMasterdatastate, long mdevPushSequencenumber, Date mdevStatemod, String mdevStatemoduser, short mdevPushIsactive, short mdevCleanoruncleanonly, short mdevIspreparationdevice, short mdevIsorderdevice, short mdevIscleaningdevice, short mdevIstransportdevice) {
        this.mdevGuid = mdevGuid;
        this.mdevName = mdevName;
        this.mdevIsbedcenter = mdevIsbedcenter;
        this.mdevValidfrom = mdevValidfrom;
        this.mdevValidto = mdevValidto;
        this.mdevOcnew = mdevOcnew;
        this.mdevUsernew = mdevUsernew;
        this.mdevOcmod = mdevOcmod;
        this.mdevSortno = mdevSortno;
        this.mdevLocked = mdevLocked;
        this.mdevPushIsready = mdevPushIsready;
        this.mdevPushMasterdatastate = mdevPushMasterdatastate;
        this.mdevPushSequencenumber = mdevPushSequencenumber;
        this.mdevStatemod = mdevStatemod;
        this.mdevStatemoduser = mdevStatemoduser;
        this.mdevPushIsactive = mdevPushIsactive;
        this.mdevCleanoruncleanonly = mdevCleanoruncleanonly;
        this.mdevIspreparationdevice = mdevIspreparationdevice;
        this.mdevIsorderdevice = mdevIsorderdevice;
        this.mdevIscleaningdevice = mdevIscleaningdevice;
        this.mdevIstransportdevice = mdevIstransportdevice;
    }

    public String getMdevGuid() {
        return mdevGuid;
    }

    public void setMdevGuid(String mdevGuid) {
        this.mdevGuid = mdevGuid;
    }

    public String getMdevName() {
        return mdevName;
    }

    public void setMdevName(String mdevName) {
        this.mdevName = mdevName;
    }

    public short getMdevIsbedcenter() {
        return mdevIsbedcenter;
    }

    public void setMdevIsbedcenter(short mdevIsbedcenter) {
        this.mdevIsbedcenter = mdevIsbedcenter;
    }

    public Date getMdevValidfrom() {
        return mdevValidfrom;
    }

    public void setMdevValidfrom(Date mdevValidfrom) {
        this.mdevValidfrom = mdevValidfrom;
    }

    public Date getMdevValidto() {
        return mdevValidto;
    }

    public void setMdevValidto(Date mdevValidto) {
        this.mdevValidto = mdevValidto;
    }

    public Date getMdevOcnew() {
        return mdevOcnew;
    }

    public void setMdevOcnew(Date mdevOcnew) {
        this.mdevOcnew = mdevOcnew;
    }

    public String getMdevUsernew() {
        return mdevUsernew;
    }

    public void setMdevUsernew(String mdevUsernew) {
        this.mdevUsernew = mdevUsernew;
    }

    public Date getMdevOcmod() {
        return mdevOcmod;
    }

    public void setMdevOcmod(Date mdevOcmod) {
        this.mdevOcmod = mdevOcmod;
    }

    public String getMdevUsermod() {
        return mdevUsermod;
    }

    public void setMdevUsermod(String mdevUsermod) {
        this.mdevUsermod = mdevUsermod;
    }

    public int getMdevSortno() {
        return mdevSortno;
    }

    public void setMdevSortno(int mdevSortno) {
        this.mdevSortno = mdevSortno;
    }

    public short getMdevLocked() {
        return mdevLocked;
    }

    public void setMdevLocked(short mdevLocked) {
        this.mdevLocked = mdevLocked;
    }

    public String getMdevPushForeignDeviceid() {
        return mdevPushForeignDeviceid;
    }

    public void setMdevPushForeignDeviceid(String mdevPushForeignDeviceid) {
        this.mdevPushForeignDeviceid = mdevPushForeignDeviceid;
    }

    public short getMdevPushIsready() {
        return mdevPushIsready;
    }

    public void setMdevPushIsready(short mdevPushIsready) {
        this.mdevPushIsready = mdevPushIsready;
    }

    public int getMdevPushMasterdatastate() {
        return mdevPushMasterdatastate;
    }

    public void setMdevPushMasterdatastate(int mdevPushMasterdatastate) {
        this.mdevPushMasterdatastate = mdevPushMasterdatastate;
    }

    public long getMdevPushSequencenumber() {
        return mdevPushSequencenumber;
    }

    public void setMdevPushSequencenumber(long mdevPushSequencenumber) {
        this.mdevPushSequencenumber = mdevPushSequencenumber;
    }

    public Date getMdevStatemod() {
        return mdevStatemod;
    }

    public void setMdevStatemod(Date mdevStatemod) {
        this.mdevStatemod = mdevStatemod;
    }

    public String getMdevStatemoduser() {
        return mdevStatemoduser;
    }

    public void setMdevStatemoduser(String mdevStatemoduser) {
        this.mdevStatemoduser = mdevStatemoduser;
    }

    public short getMdevPushIsactive() {
        return mdevPushIsactive;
    }

    public void setMdevPushIsactive(short mdevPushIsactive) {
        this.mdevPushIsactive = mdevPushIsactive;
    }

    public short getMdevCleanoruncleanonly() {
        return mdevCleanoruncleanonly;
    }

    public void setMdevCleanoruncleanonly(short mdevCleanoruncleanonly) {
        this.mdevCleanoruncleanonly = mdevCleanoruncleanonly;
    }

    public short getMdevIspreparationdevice() {
        return mdevIspreparationdevice;
    }

    public void setMdevIspreparationdevice(short mdevIspreparationdevice) {
        this.mdevIspreparationdevice = mdevIspreparationdevice;
    }

    public short getMdevIsorderdevice() {
        return mdevIsorderdevice;
    }

    public void setMdevIsorderdevice(short mdevIsorderdevice) {
        this.mdevIsorderdevice = mdevIsorderdevice;
    }

    public short getMdevIscleaningdevice() {
        return mdevIscleaningdevice;
    }

    public void setMdevIscleaningdevice(short mdevIscleaningdevice) {
        this.mdevIscleaningdevice = mdevIscleaningdevice;
    }

    public short getMdevIstransportdevice() {
        return mdevIstransportdevice;
    }

    public void setMdevIstransportdevice(short mdevIstransportdevice) {
        this.mdevIstransportdevice = mdevIstransportdevice;
    }

    public String getMdevBedcenterGuid() {
        return mdevBedcenterGuid;
    }

    public void setMdevBedcenterGuid(String mdevBedcenterGuid) {
        this.mdevBedcenterGuid = mdevBedcenterGuid;
    }

    public String getMdevTeamGuid() {
        return mdevTeamGuid;
    }

    public void setMdevTeamGuid(String mdevTeamGuid) {
        this.mdevTeamGuid = mdevTeamGuid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mdevGuid != null ? mdevGuid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mobiledevice)) {
            return false;
        }
        Mobiledevice other = (Mobiledevice) object;
        if ((this.mdevGuid == null && other.mdevGuid != null) || (this.mdevGuid != null && !this.mdevGuid.equals(other.mdevGuid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "de.haruko.ejbtestrestproxy.Mobiledevice[ mdevGuid=" + mdevGuid + " ]";
    }

}
