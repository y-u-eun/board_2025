package kr.ac.kopo.ctc.kopo36.board.domain;

import jakarta.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Post getPost() {
        return post;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
