package kr.ac.kopo.ctc.kopo36.board.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    private String user_name;
    private String phone;
    private String user_nick;

    public Long getUser_id() {
        return user_id;
    }

    public String getPhone() {
        return phone;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_nick() {
        return user_nick;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setUser_nick(String user_nick) {
        this.user_nick = user_nick;
    }
}
