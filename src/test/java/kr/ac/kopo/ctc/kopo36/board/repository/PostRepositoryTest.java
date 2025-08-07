package kr.ac.kopo.ctc.kopo36.board.repository;

import kr.ac.kopo.ctc.kopo36.board.domain.Child;
import kr.ac.kopo.ctc.kopo36.board.domain.Post;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

@SpringBootTest
public class PostRepositoryTest {

    @Autowired
    PostRepository postRepository;

    @Test
    void selectAll() {
        PageRequest pageable = PageRequest.of(0, 10);
        Page<Post> page = postRepository.selectAll(pageable);

        for (Post p : page) {
            System.out.println(p.getTitle());
        }
    }
}
