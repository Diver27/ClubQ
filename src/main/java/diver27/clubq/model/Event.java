package diver27.clubq.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="act")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="act_id")
    private Integer id;

    @Column(name="act_name")
    private String title;

    @Column(name="club_id")
    private Integer clubId;

    @Column(name="act_time")
    private Timestamp time;

    @Column(name="act_place")
    private String location;

    @Column(name="act_intro")
    private String description;

    @Column(name="act_state")
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getClubId() {
        return clubId;
    }

    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
