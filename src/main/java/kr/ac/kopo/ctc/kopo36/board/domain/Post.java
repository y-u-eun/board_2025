package kr.ac.kopo.ctc.kopo36.board.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;
    private LocalDateTime date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board board;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Board getBoard() {
        return board;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    public User getUser() {
        return user;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
