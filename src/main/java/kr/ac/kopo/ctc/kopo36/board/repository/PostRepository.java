package kr.ac.kopo.ctc.kopo36.board.repository;

import kr.ac.kopo.ctc.kopo36.board.domain.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long>, JpaSpecificationExecutor<Post> {
    @Query("SELECT p FROM Post p")
    Page<Post> selectAll(Pageable pageable);

    Optional<Post> findById(Long id);
}
