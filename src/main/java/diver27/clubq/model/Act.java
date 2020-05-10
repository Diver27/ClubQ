package diver27.clubq.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Act {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer act_id;
    private String act_name;
    private Integer club_id;
    private Timestamp act_time;
    private String act_place;
    private String act_intro;
    private Integer act_state;

    public Integer getAct_id() {
        return act_id;
    }

    public void setAct_id(Integer act_id) {
        this.act_id = act_id;
    }

    public String getAct_name() {
        return act_name;
    }

    public void setAct_name(String act_name) {
        this.act_name = act_name;
    }

    public Integer getClub_id() {
        return club_id;
    }

    public void setClub_id(Integer club_id) {
        this.club_id = club_id;
    }

    public Timestamp getAct_time() {
        return act_time;
    }

    public void setAct_time(Timestamp act_time) {
        this.act_time = act_time;
    }

    public String getAct_place() {
        return act_place;
    }

    public void setAct_place(String act_place) {
        this.act_place = act_place;
    }

    public String getAct_intro() {
        return act_intro;
    }

    public void setAct_intro(String act_intro) {
        this.act_intro = act_intro;
    }

    public Integer getAct_state() {
        return act_state;
    }

    public void setAct_state(Integer act_state) {
        this.act_state = act_state;
    }
}
