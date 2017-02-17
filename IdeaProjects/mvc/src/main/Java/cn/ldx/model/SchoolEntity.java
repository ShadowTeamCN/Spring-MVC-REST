package cn.ldx.model;

import javax.persistence.*;

/**
 * Created by Doenix Liu on 2017/2/16.
 */
@Entity
@Table(name = "school", schema = "springproject")
public class SchoolEntity {
    private int sid;
    private String name;
    private String saddress;
    private String baddress;
    private String laddress;
    private String sic;
    private Integer px;
    private String tj;
    private String scontent;

    @Id
    @Column(name = "SID", nullable = false)
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "NAME", nullable = true, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "SADDRESS", nullable = true, length = 100)
    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    @Basic
    @Column(name = "BADDRESS", nullable = true, length = 100)
    public String getBaddress() {
        return baddress;
    }

    public void setBaddress(String baddress) {
        this.baddress = baddress;
    }

    @Basic
    @Column(name = "LADDRESS", nullable = true, length = 100)
    public String getLaddress() {
        return laddress;
    }

    public void setLaddress(String laddress) {
        this.laddress = laddress;
    }

    @Basic
    @Column(name = "SIC", nullable = true, length = 50)
    public String getSic() {
        return sic;
    }

    public void setSic(String sic) {
        this.sic = sic;
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

    @Basic
    @Column(name = "SCONTENT", nullable = true, length = -1)
    public String getScontent() {
        return scontent;
    }

    public void setScontent(String scontent) {
        this.scontent = scontent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SchoolEntity that = (SchoolEntity) o;

        if (sid != that.sid) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (saddress != null ? !saddress.equals(that.saddress) : that.saddress != null) return false;
        if (baddress != null ? !baddress.equals(that.baddress) : that.baddress != null) return false;
        if (laddress != null ? !laddress.equals(that.laddress) : that.laddress != null) return false;
        if (sic != null ? !sic.equals(that.sic) : that.sic != null) return false;
        if (px != null ? !px.equals(that.px) : that.px != null) return false;
        if (tj != null ? !tj.equals(that.tj) : that.tj != null) return false;
        if (scontent != null ? !scontent.equals(that.scontent) : that.scontent != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sid;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (saddress != null ? saddress.hashCode() : 0);
        result = 31 * result + (baddress != null ? baddress.hashCode() : 0);
        result = 31 * result + (laddress != null ? laddress.hashCode() : 0);
        result = 31 * result + (sic != null ? sic.hashCode() : 0);
        result = 31 * result + (px != null ? px.hashCode() : 0);
        result = 31 * result + (tj != null ? tj.hashCode() : 0);
        result = 31 * result + (scontent != null ? scontent.hashCode() : 0);
        return result;
    }
}
