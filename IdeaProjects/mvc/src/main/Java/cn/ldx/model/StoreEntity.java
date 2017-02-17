package cn.ldx.model;

import javax.persistence.*;

/**
 * Created by Doenix Liu on 2017/2/16.
 */
@Entity
@Table(name = "store", schema = "springproject")
public class StoreEntity {
    private int sid;
    private int lid;
    private String storename;
    private String photo;
    private String address;
    private String context;
    private Integer summ;
    private Integer px;
    private String tj;

    @Id
    @Column(name = "SID", nullable = false)
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "LID", nullable = false)
    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    @Basic
    @Column(name = "STORENAME", nullable = true, length = 100)
    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }

    @Basic
    @Column(name = "PHOTO", nullable = true, length = 100)
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Basic
    @Column(name = "ADDRESS", nullable = true, length = 100)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "CONTEXT", nullable = true, length = -1)
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Basic
    @Column(name = "SUMM", nullable = true)
    public Integer getSumm() {
        return summ;
    }

    public void setSumm(Integer summ) {
        this.summ = summ;
    }

    @Basic
    @Column(name = "PX", nullable = true)
    public Integer getPx() {
        return px;
    }

    public void setPx(Integer px) {
        this.px = px;
    }

    @Basic
    @Column(name = "TJ", nullable = true, length = 100)
    public String getTj() {
        return tj;
    }

    public void setTj(String tj) {
        this.tj = tj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StoreEntity that = (StoreEntity) o;

        if (sid != that.sid) return false;
        if (lid != that.lid) return false;
        if (storename != null ? !storename.equals(that.storename) : that.storename != null) return false;
        if (photo != null ? !photo.equals(that.photo) : that.photo != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (context != null ? !context.equals(that.context) : that.context != null) return false;
        if (summ != null ? !summ.equals(that.summ) : that.summ != null) return false;
        if (px != null ? !px.equals(that.px) : that.px != null) return false;
        if (tj != null ? !tj.equals(that.tj) : that.tj != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sid;
        result = 31 * result + lid;
        result = 31 * result + (storename != null ? storename.hashCode() : 0);
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (context != null ? context.hashCode() : 0);
        result = 31 * result + (summ != null ? summ.hashCode() : 0);
        result = 31 * result + (px != null ? px.hashCode() : 0);
        result = 31 * result + (tj != null ? tj.hashCode() : 0);
        return result;
    }
}
