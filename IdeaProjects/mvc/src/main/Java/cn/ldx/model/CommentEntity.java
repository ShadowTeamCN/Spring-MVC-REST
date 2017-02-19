package cn.ldx.model;

import javax.persistence.*;

/**
 * Created by Doenix Liu on 2017/2/18.
 */
@Entity
@Table(name = "comment", schema = "springproject", catalog = "")
public class CommentEntity {
    private int cid;
    private String comment;
    private int sid;

    @Id
    @Column(name = "CID", nullable = false)
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Basic
    @Column(name = "COMMENT", nullable = true, length = -1)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "SID", nullable = false)
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentEntity that = (CommentEntity) o;

        if (cid != that.cid) return false;
        if (sid != that.sid) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cid;
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + sid;
        return result;
    }
}
